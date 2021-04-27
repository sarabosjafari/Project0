package com.project0.bankappDAO;



public class BusinessException extends Exception {
    public BusinessException() {
    }

    public BusinessException(final String message) {
        super(message);
    }
}
