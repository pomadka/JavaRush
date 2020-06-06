package com.javarush.task.task03.task0325;

/* 
Финансовые ожидания
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sSalary = reader.readLine();
        int salary = Integer.parseInt(sSalary);

        System.out.println("Я буду зарабатывать $" + salary + " в час");
    }
}
