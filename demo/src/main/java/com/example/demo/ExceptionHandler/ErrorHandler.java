package com.example.demo.ExceptionHandler;

public class ErrorHandler extends RuntimeException{
    public ErrorHandler(String message) {
        super(message);
    }

    public ErrorHandler(String message, Throwable cause) {
        super(message, cause);
    }

    public ErrorHandler(Throwable cause) {
        super(cause);
    }
}
