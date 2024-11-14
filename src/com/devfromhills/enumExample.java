package com.devfromhills;


//enum : enumeration are special data type used to define the collection of constant
enum WEEKDAYS {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}


public class enumExample {

    public static void main(String[] args) {
        WEEKDAYS today = WEEKDAYS.THURSDAY;

        switch (today) {
            case THURSDAY:
                System.out.println("hello it is Thursday");
                break;
            default:
                System.out.println("any other day");

        }

        //iterating
        System.out.println("Days of the week");
        for (WEEKDAYS weekday : WEEKDAYS.values()) {
            System.out.println(weekday);

        }
    }

}
