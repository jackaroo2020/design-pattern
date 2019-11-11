package com.lvt.pattern_05;

/**
 * @Description: java类作用描述
 * @Author: LT
 * @CreateDate: 2019/11/11 17:31
 * @Version: 1.0.0
 */
public class Rectangle extends Shape {


    void draw() {
        System.out.println("Rectangle draw():method");
    }

    public Rectangle(){
        type = "Rectangle";
    }
}
