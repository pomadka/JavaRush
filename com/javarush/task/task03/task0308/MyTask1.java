package com.javarush.task.task03.task0308;

// В диапазоне от 0 до 200 вывести на экран все числа
// которые содержат цифру 8
// пример: 8 18 28 38 48 58 и так далее
//
public class MyTask1 {
    public static void main(String[] args) {
        for (int i = 0; i <= 200; i++) {
            String num = Integer.toString(i);
            if (num.contains("8")) {
                System.out.println(num);
            }

        }
    }
}
