package ru.sakaev.project.controller.exception;

import lombok.Data;

@Data
public class ErrorResponse {

    private int status;

    private String error;

    private long timeStamp;

    public ErrorResponse() {
    }

    public ErrorResponse(int status, String message, long timeStamp) {
        this.status = status;
        this.error = message;
        this.timeStamp = timeStamp;
    }
}
