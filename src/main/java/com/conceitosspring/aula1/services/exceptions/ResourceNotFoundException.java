package com.conceitosspring.aula1.services.exceptions;

public class ResourceNotFoundException extends RuntimeException{

    private static final long serialVersionUID = 1l;

    public ResourceNotFoundException(Object id){
        super("Resource not found. ID " + id);
    }
}
