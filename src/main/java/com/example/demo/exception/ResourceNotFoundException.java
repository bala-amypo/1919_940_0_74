package com.example.demo.exception;


public class ResouceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(String message){
        super(message);
    }

}