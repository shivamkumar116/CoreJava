package com.devfromhills.oops;

public class InterfaceMain implements MyInterface {

    public static void main(String[] args) {
        InterfaceMain interfaceMain = new InterfaceMain();
        interfaceMain.greet("shivam");
        interfaceMain.sayHello();

    }

    @Override
    public void sayHello() {
        System.out.println("Hello");
    }

    @Override
    public void greet(String name) {
        System.out.println("hello  :" + name);
    }
}
