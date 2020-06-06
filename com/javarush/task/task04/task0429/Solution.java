package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        int num3 = Integer.parseInt(reader.readLine());

        int[] array = {num1, num2, num3};
        int countMinus = 0;
        int countPlus = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                countPlus++;
            } else if (array[i] < 0) {
                    countMinus++;
                }
            }
        System.out.println("количество положительных чисел: " + countPlus);
        System.out.println("количество отрицательных чисел: " + countMinus);
        }
}