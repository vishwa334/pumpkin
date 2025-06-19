package com.codeIntern.pumbkin.exceptions;


//   When Resource is not Found then This Exception is Occur //
public class ResourceNotFoundException  extends RuntimeException{
    public ResourceNotFoundException(String message) {
        super(message);
    }
}
