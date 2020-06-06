package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        int num3 = Integer.parseInt(reader.readLine());
        int num4 = Integer.parseInt(reader.readLine());

        int max1 = maxOfTwo(num1, num2);
        int max2 = maxOfTwo(num3, num4);

        if (max1 < max2) {
            System.out.println(max2);
        } else if (max1 > max2) {
            System.out.println(max1);
        } else {
            System.out.println(max1);
        }
    }

    public static int maxOfTwo(int n1, int n2) {

        if (n1 < n2) {
            return n2;
        } else {
            return n1;
        }
    }
}