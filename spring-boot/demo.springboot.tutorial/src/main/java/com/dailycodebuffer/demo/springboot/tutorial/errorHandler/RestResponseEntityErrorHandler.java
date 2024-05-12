package com.dailycodebuffer.demo.springboot.tutorial.errorHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
@RestControllerAdvice
@ResponseStatus
public class RestResponseEntityErrorHandler extends ResponseEntityExceptionHandler {
@ExceptionHandler(DepartmentErrorHandler.class)
    public ResponseEntity<ErrorMessage>  departmentNotFound(DepartmentErrorHandler departmentErrorHandler, WebRequest webRequest)
    {
        ErrorMessage errorMessage=new ErrorMessage(HttpStatus.NOT_FOUND,departmentErrorHandler.getMessage());

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMessage);

    }

}
