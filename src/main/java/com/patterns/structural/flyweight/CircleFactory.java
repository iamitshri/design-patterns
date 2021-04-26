package com.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CircleFactory {

    static Map<String, Circle> circleMap = new HashMap<>();

    static Circle getCircle(String color) {
        if (!circleMap.containsKey(color)) {
            circleMap.put(color, new Circle(color));
            System.out.println("created circle of color:"+color);
        }
        return circleMap.get(color);
    }
}
