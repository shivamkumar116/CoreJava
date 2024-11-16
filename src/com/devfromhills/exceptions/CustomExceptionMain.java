package com.devfromhills.exceptions;

public class CustomExceptionMain {

    public static void main(String[] args) throws CustomException {
        try {
            int age = 2;
            if (age < 18) {
                throw new CustomException("invalid age");
            }
        } finally {
            System.out.println("finally called");
        }


        //Custom runtime Exception
        try {
            char[] charArray = {'a', 'b', 'c'};
            charArray[3] = 'd';
            System.out.println(charArray);
        } catch (CustomRuntimeException e1) {
            System.out.println(e1.getMessage());
        }


    }
}
