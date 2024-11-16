package com.devfromhills.oops;

abstract class Phone {


    Phone(){
        System.out.println("called phone constructor");
    }

    abstract void makeCall();
    abstract void operatingSystem(String os);

    boolean hasBattery(){
        return true;
    }
}
