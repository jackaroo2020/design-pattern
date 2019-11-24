package com.lvt.pattern_12;

import java.util.HashMap;

/**
 * @Description: java类作用描述
 * @Author: LT
 * @CreateDate: 2019/11/24 11:04
 * @Version: 1.0.0
 */
public class ShapeFactory {

    private static final HashMap<String,Shape> circleMap = new HashMap<String, Shape>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) circleMap.get(color);

        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color,circle);
            System.out.println("createing circle of color:"+color);
        }
        return circle;
    }
}
