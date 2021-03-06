package com.lvt.pattern_01;

import com.lvt.common.ShapeEnum;

/**
 * @Description: java类作用描述
 * @Author: LT
 * @CreateDate: 2019/10/31 22:49
 * @Version: 1.0.0
 */
public class ShapeFactory {

    /**
     * 形状工厂
     *
     * @param shapeEnum
     * @return
     */
    public Shape getShape(ShapeEnum shapeEnum) {
        Shape shape = null;
        switch (shapeEnum) {
            case CIRCLE:
                shape = new Circle();
                break;
            case RECTANGELE:
                shape = new Rectangle();
                break;
            case SQURE:
                shape = new Square();
                break;
            default:
                break;
        }
        return shape;
    }

}
