package com.devfromhills.flowcontrol;

public class loops {

    public static void main(String[] args) {
        //for loop
        for (int i = 1; i <= 10; i++) {
            //exit if i==9
            if (i == 9) break;
            System.out.println(i);
        }
        //while loop

        int index = 1;
        while (index <= 10) {
            System.out.println(index);
            index++;
        }


        //do -while
        int n = 1;
        do {
            System.out.println(n);
            n++;
        } while (n <= 10);


        //ehanced for loop
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i : numbers) {
            System.out.println(i);
        }


        //continue statement
        //find the odd numbers in 1-10
        for (int j = 0; j < 10; j++) {
            if(j%2==0)
                continue; //skip the whole iteration and continue with the next iteration
            System.out.println(j);

        }

    }

}
