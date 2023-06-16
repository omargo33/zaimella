package com.bestech.articulos.servicio;

import java.sql.SQLException;

import javax.persistence.EntityManager;
import javax.persistence.FlushModeType;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;
import javax.transaction.Transactional;

import org.hibernate.exception.GenericJDBCException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.aplicaciones13.factory.BundleFactory;
import com.aplicaciones13.tools.Bundles;
import com.bestech.articulos.Constanstes;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * Servicio para el objeto RecepcionOrdenCompra
 * 
 * @author Bestech [Ov]
 * @date 2023-04-06
 * 
 */
@Slf4j
@Service
@Transactional(Transactional.TxType.REQUIRES_NEW)
@RequiredArgsConstructor
public class ProcesosServicios {

    Bundles bundle = BundleFactory.createBundle("info");

    @Autowired
    private final EntityManager entityManager;

    /**
     * Ejecuta el storage procedure para ejecutar el proceso de recepcion de orden
     * de compra
     * 
     * @param id
     * @return
     * @throws SQLException
     */
    public String procesarRecepcionOrdenCompra(long id) {
        entityManager.setFlushMode(FlushModeType.COMMIT);

        StoredProcedureQuery storedProcedureQuery = this.entityManager
                .createStoredProcedureQuery("DATA.PK_BT01_ARTICULOS_JDE.sp_procesarordencompra");
        storedProcedureQuery.setFlushMode(FlushModeType.COMMIT);
        storedProcedureQuery.registerStoredProcedureParameter("p_id", Long.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("p_mensaje", String.class, ParameterMode.OUT);
        storedProcedureQuery.setParameter("p_id", id);

        try {
            storedProcedureQuery.execute();
        } catch (javax.persistence.PersistenceException e) {
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            return escogerError(encontrarSalidaSqlException(encontrarSalidaSqlGenericException(e)).getMessage());
        }

        String error = String.valueOf(storedProcedureQuery.getOutputParameterValue("p_mensaje"));
        if (error == null || error.isEmpty() || error.equals("null")) {
            TransactionAspectSupport.currentTransactionStatus().flush();
            return Constanstes.PROCESO_OK;
        }

        return Constanstes.PROCESO_ERROR;
    }

    /**
     * Ejecuta el storage procedure para ejecutar el proceso creacion de articulos.
     * 
     * @param id
     * @return
     * @throws SQLException
     */
    public String procesarArticulo(long id){
        entityManager.setFlushMode(FlushModeType.COMMIT);

        StoredProcedureQuery storedProcedureQuery = this.entityManager
                .createStoredProcedureQuery("DATA.PK_BT01_ARTICULOS_JDE.sp_procesararticulo");
        storedProcedureQuery.setFlushMode(FlushModeType.COMMIT);
        storedProcedureQuery.registerStoredProcedureParameter("p_id", Long.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("p_mensaje", String.class, ParameterMode.OUT);
        storedProcedureQuery.setParameter("p_id", id);

        try {
            storedProcedureQuery.execute();
        } catch (javax.persistence.PersistenceException e) {
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            return escogerError(encontrarSalidaSqlException(encontrarSalidaSqlGenericException(e)).getMessage());
        }

        String error = String.valueOf(storedProcedureQuery.getOutputParameterValue("p_mensaje"));
        if (error == null || error.isEmpty() || error.equals("null")) {
            TransactionAspectSupport.currentTransactionStatus().flush();
            return Constanstes.PROCESO_OK;
        }

        return Constanstes.PROCESO_ERROR;
    }

    /**
     * Ejecuta el storage procedure para ejecutar el proceso creacion de alamacen.
     * 
     * @param id
     * @return
     * @throws SQLException
     */
    public String procesarAlmacen(long id){
        entityManager.setFlushMode(FlushModeType.COMMIT);

        StoredProcedureQuery storedProcedureQuery = this.entityManager
                .createStoredProcedureQuery("DATA.PK_BT01_ARTICULOS_JDE.sp_procesaralmacen");
        storedProcedureQuery.setFlushMode(FlushModeType.COMMIT);
        storedProcedureQuery.registerStoredProcedureParameter("p_id", Long.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("p_mensaje", String.class, ParameterMode.OUT);
        storedProcedureQuery.setParameter("p_id", id);

        try {
            storedProcedureQuery.execute();
        } catch (javax.persistence.PersistenceException e) {
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            return escogerError(encontrarSalidaSqlException(encontrarSalidaSqlGenericException(e)).getMessage());
        }

        String error = String.valueOf(storedProcedureQuery.getOutputParameterValue("p_mensaje"));
        if (error == null || error.isEmpty() || error.equals("null")) {
            TransactionAspectSupport.currentTransactionStatus().flush();
            return Constanstes.PROCESO_OK;
        }

        return Constanstes.PROCESO_ERROR;
    }

    /**
     * Metodo para encontrar la salida de la excepcion sql
     * 
     * @param t
     * @return
     */
    private SQLException encontrarSalidaSqlException(GenericJDBCException t) {
        Throwable root = t;
        while (root.getCause() instanceof SQLException) {
            return (SQLException) root.getCause();
        }
        return null;
    }

    /**
     * Metodo para encontrar la salida de la excepcion generica
     * 
     * @param t
     * @return
     */
    private GenericJDBCException encontrarSalidaSqlGenericException(javax.persistence.PersistenceException t) {
        Throwable root = t;
        while (root.getCause() instanceof GenericJDBCException) {
            return (GenericJDBCException) root.getCause();
        }
        return null;
    }

    /** 
     * Metodo para escoger el error que se va a mostrar al usuario
     * 
     * Si no hay errores, presenta un error default desde las propiedades
     * 
     * 
     * 
     * @param mensajeError
     */
    private String escogerError(String mensajeError) {
        if (mensajeError == null || mensajeError.isEmpty() || mensajeError.equals("null")) {
            return bundle.getString("procesosServicios.errorProcesoErrorDefault");
        }
        String errores[] = mensajeError.split("\n");
        for (String error : errores) {
            log.error("Error: {}", error);

            if (error.contains("ORA-20001")) {
                return bundle.getString("procesosServicios.errorProceso", error);
            }
        }

        return bundle.getString("procesosServicios.errorProceso", errores[0]);
    }
}
