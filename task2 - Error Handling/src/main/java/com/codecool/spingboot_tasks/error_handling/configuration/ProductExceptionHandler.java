package com.codecool.spingboot_tasks.error_handling.configuration;

import com.codecool.spingboot_tasks.error_handling.exceptions.ProductNotFoundException;
import com.codecool.spingboot_tasks.error_handling.exceptions.ProductUpdateException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ProductExceptionHandler {

    @ResponseBody
    @ExceptionHandler(ProductUpdateException.class)
    @ResponseStatus(HttpStatus.FORBIDDEN)
    public String handle(ProductUpdateException ex) {
        return ex.getMessage();
    }

    @ResponseBody
    @ExceptionHandler(ProductNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String handle(ProductNotFoundException ex) {
        return ex.getMessage();
    }
}
