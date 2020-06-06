package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {

        int [] numsList;
        int sum = 0;
        int result = 0;

        for (int i = 0; i <= number; i++) {
            numsList = new int[i];
            for (int j = 0; true; i++) {
                sum += numsList[j];
                result = sum + result;
            }
        }
        return number;
    }
}