package com.devfromhills.oops;

//polymorphism is the ability to take more than one form
//achieved using either method overriding(runtime polymorphism) or method overloading (compile time polymorphism)
//
public class PolymorphismMain {

    public static void main(String[] args) {
        Animal animal= new Dog(); //upcasting
        animal.sound();

    }

}
