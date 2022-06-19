package com.school.resgistration.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.OffsetDateTime;

@ControllerAdvice public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<Object> handleExceptions(RuntimeException exception,
        WebRequest webRequest) {
        ExceptionResponse response = new ExceptionResponse();
        response.setDateTime(OffsetDateTime.now());
        response.setMessage(exception.getMessage());
        ResponseEntity<Object> entity =
            new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);

        logger.error(exception.getMessage(), exception);
        return entity;
    }
}
