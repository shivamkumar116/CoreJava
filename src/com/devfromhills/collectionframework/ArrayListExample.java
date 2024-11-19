package com.devfromhills.collectionframework;

import com.devfromhills.oops.InterfaceMain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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


        //String array to ArrayList
        String [] fruits = {"Mango","Apple"};
        List<String> fruitsList= Arrays.asList(fruits);
        System.out.println(fruitsList);

        //we cannot add the elements to the fruits list because it returns the arrays of fixed size but we can replace
      //  fruitsList.add("Pineapple"); //unsupportedOperationException
        fruitsList.set(1,"Cherry");
        System.out.println(fruitsList);


        //other way to create but it will be immutable(cannot be changed (add/replace is not possible)
        List<Integer> number= List.of(1,2,4,4,5,7);
        System.out.println(number);

        //addAll method
        List<Integer> list = new ArrayList<>();
        list.add(1);
        List<Integer>number1= List.of(2,4,5,6);

        list.addAll(number1);
        System.out.println(list);


        //removing the element
        list.remove(1); //this will remove the element at position 1 not the value 1
        System.out.println(list);

        //to remove with the value (Object) use the Wrapper classes
        list.remove(Integer.valueOf(1));
        System.out.println(list);


        //converting the list to array
        Integer [] newArray = list.toArray(new Integer[0]);
        for(Integer num :newArray){
            System.out.print(num+ " ");
        }

        System.out.println();
        //sorting the arrayList
        Collections.sort(fruitsList);
        System.out.println(fruitsList);



    }
}
