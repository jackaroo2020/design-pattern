package com.lvt.pattern_02;

import com.lvt.common.Constans;

/**
 * @Description: 创建一个工厂创造器/生成器类，通过传递形状或颜色信息来获取工厂。
 * @Author: LT
 * @CreateDate: 2019/11/6 8:59
 * @Version: 1.0.0
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase(Constans.SHAPE)) {
            return new ShapeFactory();
        }
        if (choice.equalsIgnoreCase(Constans.COLOR)){
            return new ColorFactory();
        }
        return null;
    }
}
