package com.bestech.articulos.http.request.common;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.hibernate.exception.GenericJDBCException;
import org.hibernate.exception.JDBCConnectionException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import org.springframework.dao.DataIntegrityViolationException;

import lombok.extern.slf4j.Slf4j;

/**
 * Clase para controlar las excepciones.
 * 
 * @author Bestech [Ov]
 * 
 * @date 2023-04-04
 * 
 */
@Slf4j
public class ComonControlador {

    private Object[] arguments;

    @Value("${spring.application.name}")
    private String appName;

    /*     @ExceptionHandler(javax.persistence.PersistenceException.class)
    public String handleConnectionError(Exception ex) {
        log.info("data ov"); 
        log.error(ex.getMessage(), ex);
         
        return "connect_error";
    }*/


    /**
     * Metodo para informar errores de validacion.
     * 
     * Controla si el error es de validacion estandar de spring
     * Controla si el error es de validacion personalizada
     * 
     * @param ex
     * @return
     */
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(value = {
            MethodArgumentNotValidException.class,
            ForeignKeyException.class,
            EmptyResultDataAccessException.class,
            HttpMessageNotReadableException.class,
            SQLException.class,
            GenericJDBCException.class,
            DataIntegrityViolationException.class })
    public Map<String, String> handleExceptions(Object ex) {
        Map<String, String> errors = new HashMap<>();
        if (ex instanceof MethodArgumentNotValidException) {
            return validationExceptions((MethodArgumentNotValidException) ex);
        }

        if (ex instanceof ForeignKeyException) {
            return foreignKeyExceptions((ForeignKeyException) ex);
        }

        if (ex instanceof EmptyResultDataAccessException) {
            return emptyResultDataAccessException();
        }

        if (ex instanceof HttpMessageNotReadableException) {
            return httpMessageNotReadableException((HttpMessageNotReadableException) ex);
        }

        if (ex instanceof DataIntegrityViolationException) {
            return sqlIntegrityConstraintViolationException((DataIntegrityViolationException) ex);
        }

        log.error("W-GS00100-2 {}", ex.getClass().getName());

        return errors;
    }

    /**
     * Metodo para informar errores de validacion estandar de spring.
     * 
     * @param ex
     * @return
     */
    private Map<String, String> validationExceptions(MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getAllErrors().forEach(error -> {
            String errorMessage = error.getDefaultMessage();
            String fieldName = "";
            try {
                fieldName = ((FieldError) error).getField();
            } catch (Exception e) {
                arguments = error.getArguments();
                if (arguments.length > 1) {
                    fieldName = String.valueOf(arguments[1]);
                } else {
                    fieldName = error.getObjectName();
                }
            }
            errors.put(fieldName, errorMessage);
        });
        return errors;
    }

    /**
     * Metodo para informar errores de validacion personalizada de llaves foraneas.
     * 
     * @param ex
     * @return
     */
    private Map<String, String> foreignKeyExceptions(ForeignKeyException ex) {
        Map<String, String> errors = new HashMap<>();
        errors.put(getControllerMapping(), ex.getMessage());
        return errors;
    }

   

   
    /**
     * Metodo para informar errores de no hay resultados al SQL.
     */
    private Map<String, String> emptyResultDataAccessException() {
        Map<String, String> errors = new HashMap<>();
        errors.put(getControllerMapping(), "E-GS00100-8");
        return errors;
    }

    /**
     * Metodo para obtener el nombre del RequestMapping de la clase.
     */
    private String getControllerMapping() {
        String controllerMapping = this.getClass().getAnnotation(RequestMapping.class).value()[0];
        controllerMapping = controllerMapping.replace("/", "");
        return controllerMapping;
    }

    /**
     * Metodo para informar errores de validacion personalizada de formato de fechas
     * de rest.
     * 
     * Y los demas errores dejar que los maneje el estandar de spring.
     * 
     * @param ex
     * @return
     */
    private Map<String, String> httpMessageNotReadableException(HttpMessageNotReadableException ex) {
        Map<String, String> errors = new HashMap<>();
        if (ex.toString().lastIndexOf("java.util.Date") > 1) {
            errors.put(getControllerMapping(), "E-GS00100-18");
        } else {
            throw new IllegalStateException(ex.toString());
        }
        return errors;
    }

    /**
     * Metodo para informar errores de validacion personalizada de Constrain de
     * foreign de tabla de SQL.
     * 
     * @param ex
     * @return
     */
    private Map<String, String> sqlIntegrityConstraintViolationException(DataIntegrityViolationException ex) {
        Map<String, String> errors = new HashMap<>();

        errors.put(getControllerMapping(), ex.getMessage());
        return errors;
    }

    /**
     * Clase para crear un error personalizado para existencia de llaves foraneas.
     * 
     * @author Bestech [Ov]
     * @date 2023-04-04
     * 
     */
    public class ForeignKeyException extends RuntimeException {
        private static final long serialVersionUID = 1L;

        /**
         * Constructor de la clase.
         * 
         * @param message
         */
        public ForeignKeyException(String message) {
            super(message);
        }
    }

}