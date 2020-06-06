package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!
*/

public class Solution {
    public static void main(String[] args) {
        Zerg zerg1 = new Zerg();
        Zerg zerg2 = new Zerg();
        Zerg zerg3 = new Zerg();
        Zerg zerg4 = new Zerg();
        Zerg zerg5 = new Zerg();

        zerg1.name = "Ku";
        zerg2.name = "le";
        zerg3.name = "gt";
        zerg4.name = "nn";
        zerg5.name = "iu";

        Protoss protos1 = new Protoss();
        Protoss protos2 = new Protoss();
        Protoss protos3 = new Protoss();

        protos1.name = "or";
        protos2.name = "tr";
        protos3.name = "zr";

        Terran terran1 = new Terran();
        Terran terran2 = new Terran();
        Terran terran3 = new Terran();
        Terran terran4 = new Terran();

        terran1.name = "edcs";
        terran2.name = "es";
        terran3.name = "sfd";
        terran4.name = "wde";

    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
