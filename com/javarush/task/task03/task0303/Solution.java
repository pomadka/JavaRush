package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(23, 78));
        System.out.println(convertEurToUsd(45, 78));
    }

    public static double convertEurToUsd(int eur, double exchangeRate) {

        return eur * exchangeRate;

    }
}
