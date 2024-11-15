package com.devfromhills.oops;

public class Iphone extends Phone {

    @Override
    void makeCall() {
        System.out.println("Iphone makes call");
    }

    @Override
    void operatingSystem(String os) {
        System.out.println("iphone has :" + os);

    }

}
