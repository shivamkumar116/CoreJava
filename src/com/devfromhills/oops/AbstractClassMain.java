package com.devfromhills.oops;
/*Inheritance is a mechanism that allows a class (subclass or derived class)
to inherit properties and behavior (methods) from another class (superclass or base class).*/
public class AbstractClassMain {

    public static void main(String[] args) {
        Phone phone = new Iphone();
        phone.makeCall();
        phone.operatingSystem("mac-OS");

    }

}
