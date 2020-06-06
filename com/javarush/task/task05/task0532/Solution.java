package com.javarush.task.task05.task0532;

/* 
Задача по алгоритмам
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = Integer.parseInt(reader.readLine());

        int collect;

        if (maximum > 0) {
            int nums = Integer.parseInt(reader.readLine());
//            collect = nums;
            Math.max(nums, maximum);

            System.out.println(maximum);
        }
    }
}