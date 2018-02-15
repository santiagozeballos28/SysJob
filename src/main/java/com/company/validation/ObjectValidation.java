package com.company.validation;

import com.company.util.Bundle;
import com.company.tools.ConstantData;
import com.company.util.Error;

/**
 *
 * @author santiago.mamani
 */
public class ObjectValidation {

    private Bundle bundle;

    public ObjectValidation() {
        bundle = new Bundle();
    }

    public void verifyIdentifier(Long identifier, Error error) {
        if (!ObjectValidationUtil.isValidIdentifier(identifier)) {
            Object[] args = {ConstantData.IDENTIFIER, identifier};
            String errorMessage = bundle.getMessage(ConstantData.IDENTIFIER_NOT_VALID, args);
            error.addError(errorMessage);
        }
    }

    public void verifyEmpty(Long identifier, Error error) {
        if (identifier == null) {
            Object[] args = {ConstantData.IDENTIFIER};
            String errorMessage = bundle.getMessage(ConstantData.EMPTY, args);
            error.addError(errorMessage);
        }
    }
}
