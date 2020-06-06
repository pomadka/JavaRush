package com.javarush.task.task05.task0527;

/* 
Том и Джерри
*/

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);

        Dog dunnoDog = new Dog("Dunno", 7, "grey");

        Cat tomCat = new Cat("Tom", 25, 'M');
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Dog {
        String name;
        int age;
        String color;

        public Dog(String name, int age, String color) {
            this.name = name;
            this.age = age;
            this.color = color;
        }
    }

    public static class Cat {
        String name;
        int height;
        char sex;

        public Cat(String name, int height, char sex) {
            this.name = name;
            this.height = height;
            this.sex = sex;
        }
    }
}
