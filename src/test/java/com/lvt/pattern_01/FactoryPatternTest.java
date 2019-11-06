package com.lvt.pattern_01;

import com.lvt.common.ShapeEnum;
import org.junit.Test;

import java.text.NumberFormat;
import java.util.Calendar;

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
        Shape shape1 = factory.getShape(ShapeEnum.CIRCLE);
        shape1.draw();

        Shape shape2 = factory.getShape(ShapeEnum.RECTANGELE);
        shape2.draw();

        Shape shape3 = factory.getShape(ShapeEnum.SQURE);
        shape3.draw();
    }

    @Test
    public void test() {
        Calendar calendar = Calendar.getInstance();
        NumberFormat format = NumberFormat.getInstance();
        Boolean bool = Boolean.valueOf("test");
        Integer integer = Integer.valueOf(1);
    }

}
