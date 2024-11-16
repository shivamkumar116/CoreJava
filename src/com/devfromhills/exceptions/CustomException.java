package com.devfromhills.exceptions;

//Custom Checked Exception that extends the class Exception
public class CustomException extends  Exception{

    //create constructor that atleast take one string as message to describe the error
    CustomException(String error){
        super(error);
    }

    //constructor that excepts the message and the Throwable cause
    CustomException(String error, Throwable cause){
        super(error,cause);
    }
}
