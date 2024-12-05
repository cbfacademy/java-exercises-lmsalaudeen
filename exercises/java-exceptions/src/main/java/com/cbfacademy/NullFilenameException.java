package com.cbfacademy;

public class NullFilenameException extends Exception {

    /* rather than have this return a message, should return the error code 
    that should be in the map */
    public int errorCode() {
        return -1;
    }
}