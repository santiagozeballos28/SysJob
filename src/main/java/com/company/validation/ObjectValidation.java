package com.company.validation;

import com.company.messages.Message;
import com.company.tools.ConstantData;
import com.company.util.Error;

/**
 *
 * @author santiago.mamani
 */
public class ObjectValidation {

    public void verifyIdentifier(Long identifier, Error error) {
        if (!ObjectValidationUtil.isValidIdentifier(identifier)) {
            Object[] args = {ConstantData.IDENTIFIER, identifier};
            String errorMessage = Message.getMessage(ConstantData.IDENTIFIER_NOT_VALID, args);
            error.addError(errorMessage);
        }
    }

    public void verifyEmpty(Long identifier, Error error) {
        if (identifier == null) {
            Object[] args = {ConstantData.IDENTIFIER};
            String errorMessage = Message.getMessage(ConstantData.EMPTY, args);
            error.addError(errorMessage);
        }
    }
}
