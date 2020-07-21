package ru.sakaev.project.controller.exception;

public class ErrorException extends RuntimeException{

    public ErrorException(String message) {
        super(message);
    }

    public ErrorException(String message, Throwable cause) {
        super(message, cause);
    }

    public ErrorException(Throwable cause) {
        super(cause);
    }
}
