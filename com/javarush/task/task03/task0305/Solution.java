package com.javarush.task.task03.task0305;

/* 
Я так давно родился
*/

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Solution {
    public static void main(String[] args) {
//        String monthOfBirth = "MARCH";
//        int dayOfBirth = 23;
//        int currentAge = 21;
//        int currentYear = 2020;
//        int yearOfBirth = currentYear - currentAge;
//
//        System.out.println(monthOfBirth + " " + dayOfBirth + " " + yearOfBirth);

        Calendar calendar = new GregorianCalendar(1999, 2, 23);
        Date date = calendar.getTime();
        System.out.println(date);
    }
}
