package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    private String name;
    private int weight;
    private int age;
    private String color;
    private String address;

    public void initialize(String name) {
        this.name = name;
        this.weight = 34;
        this.age = 10;
        this.color = "red";
        this.address = null;
    }

    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "blue";
        this.address = null;
    }

    public void initialize(String name, int age) {
        this.name = name;
        this.weight = 56;
        this.age = age;
        this.color = "green";
        this.address = null;
    }

    public void initialize(int weight, String color) {
        this.name = null;
        this.weight = weight;
        this.age = 23;
        this.color = color;
        this.address = null;
    }

    public void initialize(int weight, String color, String address) {
        this.name = null;
        this.weight = weight;
        this.age = 50;
        this.color = color;
        this.address = address;
    }

    public static void main(String[] args) {

    }
}
