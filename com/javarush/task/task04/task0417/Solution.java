package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sNum1 = reader.readLine();
        String sNum2 = reader.readLine();
        String sNum3 = reader.readLine();

        int num1 = Integer.parseInt(sNum1);
        int num2 = Integer.parseInt(sNum2);
        int num3 = Integer.parseInt(sNum3);


        if (num1 == num2 && num1 == num3 && num2 == num3) {
            System.out.println(num1 + " " + num2 + " " + num3);
        } else if (num1 == num2) {
            System.out.println(num1 + " " + num2);
        } else if (num1 == num3) {
            System.out.println(num1 + " " + num3);
        } else if (num2 == num3) {
            System.out.println(num2 + " " + num3);
        }
    }
}