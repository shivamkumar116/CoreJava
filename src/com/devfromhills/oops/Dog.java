package com.devfromhills.oops;

public class Dog extends  Animal{

    public void bark(){
        System.out.println("Dog bark");
    }

    @Override
    public void sound(){
        System.out.println("Dog bark");
    }
}
