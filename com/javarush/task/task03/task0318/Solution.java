package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sYears = reader.readLine();
        int years = Integer.parseInt(sYears);
        String name = reader.readLine();

        System.out.println(name + " захватит мир через " + years + " лет. Му-ха-ха!");

    }
}
