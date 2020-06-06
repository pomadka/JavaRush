package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandDadName = reader.readLine();
        Cat catGrandDad = new Cat(grandDadName, null, null);

        String grannyName = reader.readLine();
        Cat catGranny = new Cat(grannyName, null, null);

        String dadName = reader.readLine();
        Cat catDad = new Cat(dadName, null, catGrandDad);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, catGranny, null);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catMother, catDad);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, catDad);

        System.out.println(catGrandDad);
        System.out.println(catGranny);
        System.out.println(catDad);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat mother;
        private Cat dad;

        Cat(String name, Cat mother, Cat dad) {
            this.name = name;
            this.mother = mother;
            this.dad = dad;
        }

        @Override
        public String toString() {
            if (mother == null && dad == null) {
                return "The cat's name is " + name + ", no mother, no father";
            } else if (mother == null) {
                return "The cat's name is " + name + ", no mother " + ", father is " + dad.name;
            } else if (dad == null) {
                return "The cat's name is " + name + ", mother is " + mother.name + ", no father";
            } else {
                return "The cat's name is " + name + ", mother is " + mother.name + ", father is " + dad.name;
            }
        }
    }

}
