package org.example.soa_lab2_BarsService.common.throwable.exception;

public class NotFoundException extends RuntimeException {
    public NotFoundException(String message) {
        super(message);
    }
}
