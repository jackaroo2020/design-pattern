package com.lvt.pattern_05;

/**
 * @Description: java类作用描述
 * @Author: LT
 * @CreateDate: 2019/11/11 17:31
 * @Version: 1.0.0
 */
public class Circle extends Shape {


    void draw() {
        System.out.println("Circle draw():method");
    }

    public Circle(){
        type = "Circle";
    }
}
