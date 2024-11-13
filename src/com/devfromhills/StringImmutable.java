package com.devfromhills;

public class StringImmutable {

    public static void main(String[] args) {
        //Core Java

        String s1 ="Hello "; //created in String pool (pool of unique String literals)

        String s2 = s1.concat("world"); //Created an object in Heap memory
        System.out.println(s2);

        String s3= new String("Hello world"); //created a new object in the heap memory as we used the new keyword
        System.out.println(s3);

        System.out.println(s2==s3); //returns false as both s2 and s3 are different object in the heap memory

        String s4 = s1.concat("world").intern(); //created in the string pool  as it does not exist

        String s5= "Hello world"; //s5 will refer to the s4 since it is already there in the string pool
        System.out.println(s4==s5);

    }
}
