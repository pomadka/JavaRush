package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sTime = reader.readLine();
        double timeMin = Double.parseDouble(sTime);

        if (timeMin % 5 >= 0 && timeMin % 5 < 3) {
            System.out.println("зелёный");
        } else if (timeMin % 5 >= 3 && timeMin % 5 < 4) {
            System.out.println("желтый");
        } else if (timeMin % 5 < 0 || timeMin % 5 >= 4) {
            System.out.println("красный");
        }
    }
}