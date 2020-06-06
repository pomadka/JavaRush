package com.javarush.task.task06.task0618;

/* 
KissMyShinyMetalAss
*/


public class Solution {
    public static class KissMyShinyMetalAss {
        public int num = 5;
    }

    public static void main(String[] args) {
        KissMyShinyMetalAss kiss = new KissMyShinyMetalAss();
        kiss.num = 3;
        KissMyShinyMetalAss kiss2 = new KissMyShinyMetalAss();
        kiss2.num = 10;

        System.out.println(kiss.num);
        System.out.println(kiss2.num);
    }
}
