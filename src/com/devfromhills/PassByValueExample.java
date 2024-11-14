package com.devfromhills;

public class PassByValueExample {
    //java is strictly pass by value
    /*For primitive data types (int, double, boolean, etc.), the value itself is passed.
    For objects, the reference to the object is passed by value. */

    public static void main(String[] args) {

        int n = 0;
        System.out.println("Value before modify :" + n);
        modifyValue(n);
        System.out.println("value after modify method :" + n);

        //modify object
        StringBuilder sb = new StringBuilder("Hello ");
        System.out.println("String Builder before method invocation :" + sb);
        modifyReference(sb);
        System.out.println("String Builder after method invocation :" + sb);

    }

    //primitve data type
    public static void modifyValue(int n) {

        System.out.println("value is modify method :" + n);
    }

    //Object
    public static void modifyReference(StringBuilder sb) {
        sb.append("world"); //any modification done to reference object's state will be visible outside the method
        sb = new StringBuilder("reassign"); //reassigning the reference object inside the method does not have any impact outside the method
        System.out.println("in modify reference method :" + sb);
    }


}
