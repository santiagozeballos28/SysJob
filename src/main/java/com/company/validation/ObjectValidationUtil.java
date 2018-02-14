package com.company.validation;

/**
 *
 * @author santiago.mamani
 */
public class ObjectValidationUtil {

    public static boolean isValidIdentifier(Long identifier) {
        return identifier > 0;
    }
}
