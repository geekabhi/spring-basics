package com.allstate.models;

/**
 * Created by localadmin on 11/01/17.
 */
public class Hello {
    private String message;
    private String owner;

    public Hello(String message, String owner) {
        this.message = message;
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }



    public String getMessage() {
        return message;
    }

}
