package com.lvt.pattern_02;

import com.lvt.common.ColorEnum;

/**
 * @Description: java类作用描述
 * @Author: LT
 * @CreateDate: 2019/11/6 8:28
 * @Version: 1.0.0
 */
public class ColorFactory extends AbstractFactory {

    public Color getColor(ColorEnum colorEnum) {
        Color color = null;
        switch (colorEnum) {
            case RED:
                color = new Red();
                break;
            case BULE:
                color = new Blue();
                break;
            case GREEN:
                color = new Greeen();
                break;
            default:
                break;
        }
        return color;
    }

    public Shape getShape(int shapeType) {
       return null;
    }

}
