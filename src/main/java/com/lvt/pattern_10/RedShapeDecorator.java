package com.lvt.pattern_10;

/**
 * @Description: java类作用描述
 * @Author: LT
 * @CreateDate: 2019/11/24 10:16
 * @Version: 1.0.0
 */
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape) {
        System.out.println("Border Color: Red");

    }


}
