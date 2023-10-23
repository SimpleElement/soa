package org.example.soa_lab2_LabService.common.throwable.exception;

public class BadRequestException extends RuntimeException {
    public BadRequestException(String message) {
        super(message);
    }
}
