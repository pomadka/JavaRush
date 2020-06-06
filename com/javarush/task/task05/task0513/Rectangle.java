package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    private int top;
    private int left;
    private int width;
    private int height;

    Rectangle rectangle2 = new Rectangle();

    public void initialize(int top, int left, int width, int height) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

    public void initialize(int top, int left) {
        this.top = top;
        this.left = left;
        this.width = Integer.parseInt(null);
        this.height = Integer.parseInt(null);
    }

    public void initialize(int top, int left, int width) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = width;
    }

    public void initialize(Rectangle rectangle2) {
        this.top = rectangle2.top;
        this.left = rectangle2.left;
        this.width = rectangle2.width;
        this.height = rectangle2.height;
    }

    public static void main(String[] args) {

    }
}
