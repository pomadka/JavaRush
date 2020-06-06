package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        int ageScore = Integer.compare(this.age, anotherCat.age);
        int weightScore = Integer.compare(this.weight, anotherCat.weight);
        int strengthScore = Integer.compare(this.strength, anotherCat.strength);

        int finalScore = ageScore + weightScore + strengthScore;
        return finalScore > 0;
    }
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.age = 7;
        cat1.weight = 5;
        cat1.strength = 10;

        Cat cat2 = new Cat();
        cat2.age = 4;
        cat2.weight = 3;
        cat2.strength = 15;
        System.out.println(cat1.fight(cat2));
        System.out.println(cat2.fight(cat1));
    }
}
