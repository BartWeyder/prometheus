package com.demo;

/**
 * Created by Admin on 08-Apr-17.
 */
public class ExceptionSource {
    public void possibleExceptionSource(int data) throws DataValidationException {
        if (data < 0) {
            throw new DataValidationException("Error in data processing!");
        }
    }
}
