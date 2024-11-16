package com.devfromhills.exceptions;

//customRuntime Exception must extends the class RuntimeException
public class CustomRuntimeException extends  RuntimeException{

    CustomRuntimeException(String message){
        super(message);
    }
    CustomRuntimeException(String message, Throwable cause){
        super(message,cause);
    }
}
