package com.elderwood.co.api.exceptionhandler;

public class UsernameNotFoundException extends Exception{

    public UsernameNotFoundException(String message) {
        super(message);
    }
}
