package com.javarush.task.task04.task0437;

/* 
Треугольник из восьмерок
*/

public class Solution {
    public static void main(String[] args) {

        String s = "8";

        for (int i = 0; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(s);
            }
            System.out.println(s);
        }
    }
}
