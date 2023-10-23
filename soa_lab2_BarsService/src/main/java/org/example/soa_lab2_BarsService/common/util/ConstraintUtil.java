package org.example.soa_lab2_BarsService.common.util;

import jakarta.validation.ConstraintValidatorContext;

public final class ConstraintUtil {

    public static boolean addConstraintViolation(ConstraintValidatorContext context, String message) {
        context.disableDefaultConstraintViolation();
        context.buildConstraintViolationWithTemplate(message).addConstraintViolation();
        return false;
    }
}
