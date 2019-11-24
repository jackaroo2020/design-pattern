package com.lvt.pattern_07;

/**
 * @Description: 使用 DrawAPI 接口创建抽象类 Shape
 * @Author: LT
 * @CreateDate: 2019/11/20 17:56
 * @Version: 1.0.0
 */
public abstract class Shape {

    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}
