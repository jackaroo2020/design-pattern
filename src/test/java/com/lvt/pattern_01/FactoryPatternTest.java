package com.lvt.pattern_01;

import com.lvt.common.Constants;
import org.junit.Test;

/**
 * @Description: 工厂客户端
 * @Author: LT
 * @CreateDate: 2019/10/31 17:18
 * @Version: 1.0.0
 */
public class FactoryPatternTest{

    /**
     * 工厂模式
     */
    @Test
    public void factoryTest() {
        ShapeFactory factory = new ShapeFactory();
        Shape shape1 = factory.getShape(Constants.CIRCLE_TYPE);
        shape1.draw();

        Shape shape2 = factory.getShape(Constants.RECTANGELE_TYPE);
        shape2.draw();

        Shape shape3 = factory.getShape(Constants.SQUARE_TYPE);
        shape3.draw();
    }


}
