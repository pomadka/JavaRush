package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sDayNum = reader.readLine();
        int dayNum = Integer.parseInt(sDayNum);

//        if (dayNum == 1) {
//            System.out.println("понедельник");
//        } else if (dayNum == 2) {
//            System.out.println("вторник");
//        } else if (dayNum == 3) {
//            System.out.println("среда");
//        } else if (dayNum == 4) {
//            System.out.println("четверг");
//        } else if (dayNum == 5) {
//            System.out.println("пятница");
//        } else if (dayNum == 6) {
//            System.out.println("суббота");
//        } else if (dayNum == 7) {
//            System.out.println("воскресенье");
//        } else {
//            System.out.println("такого дня недели не существует");
//        }
        switch (dayNum) {
            case 1:
                System.out.println("понедельник");
                break;
            case 2:
                System.out.println("вторник");
                break;
            case 3:
                System.out.println("среда");
                break;
            default:
                System.out.println("такого дня недели не существует");
                break;
        }
    }
}