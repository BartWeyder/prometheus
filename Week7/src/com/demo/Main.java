package com.demo;

/**
 * Created by Admin on 08-Apr-17.
 */
public class Main {
    public static void main (String[] args) {
        ExceptionSource exs = new ExceptionSource();
        try {
            exs.possibleExceptionSource(10);
            exs.possibleExceptionSource(-2);
        } catch (DataValidationException e) {
            e.printStackTrace();
        }
    }
}
