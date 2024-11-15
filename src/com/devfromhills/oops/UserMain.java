package com.devfromhills.oops;

import java.util.Arrays;
import java.util.Base64;

public class UserMain {
    public static void main(String[] args) {

        //create an object of the class User
        User user = new User();
        //set the values
        user.setName("Shivam Kumar");
        user.setEmailId("shivamkumar116@gmail.com");
        user.setPassword("");

        //print the values
        System.out.println("Entered name: "+ user.getName());
        System.out.println("Entered email id : "+ user.getEmailId());
        System.out.println("Entered password :"+ user.getPassword());
    }
}
