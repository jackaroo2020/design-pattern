package com.lvt.pattern_01;

import com.lvt.common.ShapeEnum;

/**
 * @Description: java类作用描述
 * @Author: LT
 * @CreateDate: 2019/11/30 19:19
 * @Version: 1.0.0
 */
public class FactoryPatternDemo {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        //获取 Circle 的对象，并调用它的 draw 方法
        Shape shape1 = shapeFactory.getShape(ShapeEnum.CIRCLE);

        //调用 Circle 的 draw 方法
        shape1.draw();

        //获取 Rectangle 的对象，并调用它的 draw 方法
        Shape shape2 = shapeFactory.getShape(ShapeEnum.RECTANGELE);

        //调用 Rectangle 的 draw 方法
        shape2.draw();

        //获取 Square 的对象，并调用它的 draw 方法
        Shape shape3 = shapeFactory.getShape(ShapeEnum.SQURE);

        //调用 Square 的 draw 方法
        shape3.draw();
    }
}
