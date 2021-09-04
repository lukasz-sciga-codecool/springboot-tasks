package com.codecool.spingboot_tasks.error_handling.exceptions;

public class ProductUpdateException extends RuntimeException {

    public ProductUpdateException(String message) {
        super(message);
    }
}
