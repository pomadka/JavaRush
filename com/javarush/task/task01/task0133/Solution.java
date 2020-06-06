package com.javarush.task.task01.task0133;

/* 
Не думать о секундах…
*/

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Solution {
    public static void main(String[] args) {
        int secondsAfter15 = minInSec(30);
        System.out.println(secondsAfter15);
    }
    public static int minInSec(int min) {
        return min * 60;
    }
}