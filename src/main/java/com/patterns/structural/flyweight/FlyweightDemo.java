package com.patterns.structural.flyweight;

import java.util.concurrent.ThreadLocalRandom;

public class FlyweightDemo {

    public static void main(String[] args) {
        var colors = new String[]{"red", "green", "blue", "purple"};

        for (int i = 0; i < 30; i++) {
            String color = colors[ThreadLocalRandom.current()
                                                   .nextInt(colors.length)];
            Circle obj = CircleFactory.getCircle(color);
            obj.setX((int) (Math.random() * 100));
            obj.setY((int) (Math.random() * 100));
            obj.draw();
        }
    }
}
