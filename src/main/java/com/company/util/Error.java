package com.company.util;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.ArrayList;

/**
 *
 * @author santiago.mamani
 */
public class Error extends ObjectModel {

    private ArrayList<String> errors;

    public Error(String error) {
        errors = new ArrayList<String>();
        errors.add(error);
    }

    public Error() {
        errors = new ArrayList<String>();
    }

    public ArrayList<String> getErrors() {
        return errors;
    }

    public void setErrors(ArrayList<String> errors) {
        this.errors = errors;
    }

    public void addError(String error) {
        errors.add(error);
    }
    @JsonIgnore
    public boolean isEmpty() {
        return errors.isEmpty();
    }
}
