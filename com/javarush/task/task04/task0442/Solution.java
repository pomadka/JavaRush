package com.javarush.task.task04.task0442;

/* 
Суммирование
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int collect;
        int sum = 0;

        while (true) {
            int number = Integer.parseInt(reader.readLine());
            if (number == -1) {
                break;
            } else {
                collect = number;
                sum = sum + collect;
            }
        }
        System.out.println(sum + (-1));
    }
}
