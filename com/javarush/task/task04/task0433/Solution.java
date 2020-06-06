package com.javarush.task.task04.task0433;

/* 
Гадание на долларовый счет
*/

public class Solution {
    public static void main(String[] args) {
        String s = "S";
        cycle(s, 10, 10);


    }
    public static void cycle(String s, int vertical, int horizontal) {
        int v = 0;

        while (v < vertical) {
            v++;
            int h = 0;
            while (h < horizontal) {
                System.out.print(s);
                h++;
            }
            System.out.println();
        }
    }
}
