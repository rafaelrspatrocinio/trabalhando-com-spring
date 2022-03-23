package com.conceitosspring.aula1.services.exceptions;

public class DatabaseException extends RuntimeException {

    private static long serialVersionUID = 1l;

    public DatabaseException(String msg){
        super(msg);
    }
}
