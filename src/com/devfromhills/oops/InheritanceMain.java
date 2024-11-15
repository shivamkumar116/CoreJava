package com.devfromhills.oops;
/*Inheritance is a mechanism that allows a class (subclass or derived class)
to inherit properties and behavior (methods) from another class (superclass or base class).*/
public class InheritanceMain {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();//inherited method from the class Animal
        dog.bark();
    }
}
