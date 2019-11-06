package com.lvt.pattern_02;

import com.lvt.common.ColorEnum;
import com.lvt.common.Constans;
import com.lvt.common.ShapeEnum;
import org.junit.Test;

/**
 * @Description: 使用 FactoryProducer 来获取 AbstractFactory，通过传递类型信息来获取实体类的对象。
 * @Author: LT
 * @CreateDate: 2019/11/6 9:02
 * @Version: 1.0.0
 */
public class AbstractFactoryPatternDemo {

    @Test
    public  void abstractTest() {
        //获取形状工厂
        AbstractFactory shapeFactory = FactoryProducer.getFactory(Constans.SHAPE);

        //获取形状为 Circle 的对象
        Shape shape1 = shapeFactory.getShape(ShapeEnum.CIRCLE);

        //调用 Circle 的 draw 方法
        shape1.draw();

        //获取形状为 Rectangle 的对象
        Shape shape2 = shapeFactory.getShape(ShapeEnum.RECTANGELE);

        //调用 Rectangle 的 draw 方法
        shape2.draw();

        //获取形状为 Square 的对象
        Shape shape3 = shapeFactory.getShape(ShapeEnum.SQURE);

        //调用 Square 的 draw 方法
        shape3.draw();

        //获取颜色工厂
        AbstractFactory colorFactory = FactoryProducer.getFactory(Constans.COLOR);

        //获取颜色为 Red 的对象
        Color color1 = colorFactory.getColor(ColorEnum.RED);

        //调用 Red 的 fill 方法
        color1.fill();

        //获取颜色为 Green 的对象
        Color color2 = colorFactory.getColor(ColorEnum.GREEN);

        //调用 Green 的 fill 方法
        color2.fill();

        //获取颜色为 Blue 的对象
        Color color3 = colorFactory.getColor(ColorEnum.BULE);

        //调用 Blue 的 fill 方法
        color3.fill();
    }
}
