package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sNum = reader.readLine();
        int num = Integer.parseInt(sNum);
        int resultNum = 7;

        if (num < 0) {
            resultNum = resultNum + 1;
            System.out.println(num + 1);
        } else {
            System.out.println(num * 2);
        }

    }

}