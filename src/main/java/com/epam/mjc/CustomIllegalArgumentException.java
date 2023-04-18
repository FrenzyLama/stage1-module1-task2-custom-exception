package com.epam.mjc;

public class CustomIllegalArgumentException extends IllegalArgumentException {

    public CustomIllegalArgumentException(String message) {
        super(message);
    }
}
