package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());

        if (num1 < num2) {
            System.out.println(num1);
        } else if (num1 > num2) {
            System.out.println(num2);
        } else if (num1 == num2) {
            System.out.println(num1);
        }
    }
}