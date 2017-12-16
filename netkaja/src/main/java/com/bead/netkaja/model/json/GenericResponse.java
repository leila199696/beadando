package com.bead.netkaja.controller.json;

import org.springframework.http.HttpStatus;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GenericResponse {
    private int status;
    private String message;
    private String timestamp;

    public GenericResponse(HttpStatus status) {
        this.status = status.value();
        this.message = status.getReasonPhrase();
        this.timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    }

    public static GenericResponse ok() {
        return new GenericResponse(HttpStatus.OK);
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}
