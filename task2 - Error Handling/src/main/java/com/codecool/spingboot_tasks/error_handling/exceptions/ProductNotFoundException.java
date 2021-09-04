package com.codecool.spingboot_tasks.error_handling.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ProductNotFoundException extends RuntimeException {
    private String errorMsg;

    public ProductNotFoundException(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}
