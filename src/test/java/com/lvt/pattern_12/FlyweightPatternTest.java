package com.lvt.pattern_12;

import org.junit.Test;

import java.util.Map;

/**
 * @Description: java类作用描述
 * @Author: LT
 * @CreateDate: 2019/11/24 11:06
 * @Version: 1.0.0
 */
public class FlyweightPatternTest {
    private static final String colors[] =
            { "Red", "Green", "Blue", "White", "Black" };

    @Test
    public void flyWeightPatterTest() {
        for (int i = 0; i < 200; i++) {
            Circle circle = (Circle)ShapeFactory.getCircle(getRandomColor());

            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);

            circle.draw();
        }
    }

    private static String getRandomColor() {
        return colors[(int)(Math.random()*colors.length)];
    }

    private static int getRandomX() {
        return (int)(Math.random()*100);
    }

    private static int getRandomY() {
        return (int)(Math.random()*100);
    }

}
