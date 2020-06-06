package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] list = new int[3];

        for (int i = 0; i < list.length; i++) {
            list[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < list.length; i++) {
            int swiched = switching()
            System.out.print(list[i] + " ");
        }

    }

    public static int switching(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        return temp;
    }
}

