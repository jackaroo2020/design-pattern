package com.lvt.pattern_02;

import com.lvt.common.ColorEnum;
import com.lvt.common.ShapeEnum;

/**
 * @Description: java类作用描述
 * @Author: LT
 * @CreateDate: 2019/11/6 8:28
 * @Version: 1.0.0
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    public Color getColor(ColorEnum colorEnum) {
        return null;
    }

    /**
     * 形状工厂
     *
     * @param shapeEnum
     * @return
     */
    @Override
    public Shape getShape(ShapeEnum shapeEnum) {
        Shape shape = null;
        switch (shapeEnum) {
            case CIRCLE:
                shape = new Cricle();
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
