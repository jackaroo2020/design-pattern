package com.lvt.pattern_07;

/**
 * @Description: java类作用描述
 * @Author: LT
 * @CreateDate: 2019/11/20 17:57
 * @Version: 1.0.0
 */
public class Circle extends Shape {
    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void draw() {
        drawAPI.drawCircle(radius,x,y);
    }
}
