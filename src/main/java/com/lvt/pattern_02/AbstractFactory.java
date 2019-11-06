package com.lvt.pattern_02;

import com.lvt.common.ColorEnum;
import com.lvt.common.ShapeEnum;

/**
 * @Description: 为 Color 和 Shape 对象创建抽象类来获取工厂。
 * @Author: LT
 * @CreateDate: 2019/11/6 8:27
 * @Version: 1.0.0
 */
public abstract class AbstractFactory {

    public abstract Color getColor(ColorEnum colorEnum);

    public abstract Shape getShape(ShapeEnum shapeEnum);
}
