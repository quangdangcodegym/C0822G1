package com.codegym.demo7_11_22;

public class my extends Exception{
    private String error;

    public my(String error) {
        this.error = error;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
