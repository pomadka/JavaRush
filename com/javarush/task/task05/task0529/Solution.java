package com.javarush.task.task05.task0529;

/* 
Консоль-копилка
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int collect;
        int sum = 0;

        while (true) {
            String s = reader.readLine();
                if (s.equals("сумма")) {
                    break;
                } else {
                    int num = Integer.parseInt(s);
                    collect = num;
                    sum = sum + collect;
                }
            }
        System.out.println(sum);
        }
    }
