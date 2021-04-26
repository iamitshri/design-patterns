package com.patterns.structural.flyweight;

public class Circle implements Shape {

    private final String color;
    private int x;
    private int y;

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Drawing circle of color: " + color + ", at x: " + x + ", y: " + y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
