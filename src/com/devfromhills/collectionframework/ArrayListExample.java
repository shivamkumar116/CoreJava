package com.devfromhills.collectionframework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {
        List<String> arrayList= new ArrayList<>();



        arrayList.add("Shivam");
        arrayList.add("Kumar");

        //get the size of the arrayList
        System.out.println("Size : "+ arrayList.size());
        //get the element at 1st index
        System.out.println("second element : " + arrayList.get(1));

        //print
        for(int i=0; i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }

        //enhanced for loop
        for(String name:arrayList){
            System.out.println(name);
        }

        //check whether the list contain the name "Shivam"
        System.out.println(arrayList.contains("Shivam"));

        //remove
        System.out.println(arrayList.remove(1));
        System.out.println(arrayList);

        //


    }
}
