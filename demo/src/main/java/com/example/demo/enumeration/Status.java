package com.example.demo.enumeration;

public enum Status {
    MATCHING("MATCHING"),
    EXCEPTION("EXCEPTION");

    private final String status;

    Status(String status){
        this.status = status;
    }
    public String getStatus(){
        return this.status;
    }
}
