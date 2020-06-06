package com.javarush.task.task07.task0704;

/* 
Переверни массив
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

//        int size = 10;
        int[] list = new int[10];

        for (int i = 0; i < list.length; i++) {
            list[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = list.length - 1; i > -1; i--) {
//            if (i == size - 1) {
//                System.out.print(list[i]);
//            } else {
                System.out.println(list[i]);
            }
        }
    }


