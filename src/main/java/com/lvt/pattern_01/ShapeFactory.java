package com.lvt.pattern_01;

import com.lvt.common.Constants;

/**
 * @Description: java类作用描述
 * @Author: LT
 * @CreateDate: 2019/10/31 16:49
 * @Version: 1.0.0
 */
public class ShapeFactory {

    /**
     * 形状工厂
     *
     * @param type
     * @return
     */
    public Shape getShape(int type) {
        Shape shape = null;

        switch (type) {
            case Constants.CIRCLE_TYPE:
                shape = new Circle();
                break;
            case Constants.RECTANGELE_TYPE:
                shape = new Rectangle();
                break;
            case Constants.SQUARE_TYPE:
                shape = new Square();
                break;
            default:
                break;
        }
        return shape;
    }

}
