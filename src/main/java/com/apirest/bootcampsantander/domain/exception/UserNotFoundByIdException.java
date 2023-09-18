package com.apirest.bootcampsantander.domain.exception;

public class UserNotFoundByIdException extends RuntimeException{
    public UserNotFoundByIdException(){
        super();
    }
    public UserNotFoundByIdException(String message){
        super(message);
    }
}
