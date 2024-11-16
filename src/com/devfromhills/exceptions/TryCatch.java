package com.devfromhills.exceptions;

public class TryCatch {

    public static void main(String[] args) throws ArithmeticException {

        //syntax
        try{
            int n =10/0;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        catch(Exception e1){
            e1.printStackTrace();
        }
        //scenario when finally block will not execute
        //1. infinite loop
        //2. System.exit()
        //3. Fatal error such as outOfMemory or StackOverFlow
        finally{
            System.out.println("finally called");
        }


        System.out.println("outside try catch");



    }
}
