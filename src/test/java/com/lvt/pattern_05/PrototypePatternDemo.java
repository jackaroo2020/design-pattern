package com.lvt.pattern_05;

import org.junit.Test;

/**
 * @Description: rototypePatternDemo 使用 ShapeCache 类来获取存储在 Hashtable 中的形状的克隆。
 * @Author: LT
 * @CreateDate: 2019/11/11 17:57
 * @Version: 1.0.0
 */
public class PrototypePatternDemo {

    @Test
    public void prototypeTest() throws CloneNotSupportedException {
        ShapeCache.loadCache();

        Shape clonedShape =  (Shape) ShapeCache.getShape("1");
        System.out.println("Shape:"+clonedShape.getType());

        Shape clonedShape2 =  (Shape) ShapeCache.getShape("2");
        System.out.println("Shape:"+clonedShape2.getType());

        Shape clonedShape3 =  (Shape) ShapeCache.getShape("3");
        System.out.println("Shape:"+clonedShape3.getType());
    }
}
