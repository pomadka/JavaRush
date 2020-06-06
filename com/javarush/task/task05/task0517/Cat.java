package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {

    private String name;
    private int weight;
    private int age;
    private String color;
    private String address;

    public Cat(String name) {
        this.name = name;
        this.weight = 4;
        this.age = 6;
        this.color = "black";
    }

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "white";
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 5;
        this.color = "grey";
    }

    public Cat(int weight, String color) {
        this.weight = weight;
        this.color = color;
        this.age = 7;
    }

    public Cat(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = 2;
    }

    public static void main(String[] args) {

    }
}
