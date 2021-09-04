package com.codecool.spingboot_tasks.error_handling.exceptions;

public class ProductCreateException extends RuntimeException {
    private final String errorMsg;

    public ProductCreateException(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public String getErrorMsg() {
        return errorMsg;
    }
}
