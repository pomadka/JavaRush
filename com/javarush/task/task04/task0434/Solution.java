package com.javarush.task.task04.task0434;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {

        System.out.println("1 2 3 4 5 6 7 8 9 10");
        int vertical = 2;

        while (vertical <= 10) {
            System.out.print(vertical + " ");
            int horizontal = 2;
            while (horizontal <= 10) {
                System.out.print(horizontal * vertical + " ");
                horizontal++;
            }
            System.out.println();
            vertical++;
        }
    }
}

