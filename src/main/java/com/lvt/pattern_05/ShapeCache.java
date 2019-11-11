package com.lvt.pattern_05;

import java.util.HashMap;

/**
 * @Description: 创建一个类，从数据库获取实体类，并把它们存储在一个 Hashtable 中
 * @Author: LT
 * @CreateDate: 2019/11/11 17:33
 * @Version: 1.0.0
 */
public class ShapeCache {

    private static HashMap<String,Shape> shapeMap = new HashMap<String, Shape>();

    public static Shape getShape(String shapeId) throws CloneNotSupportedException {
       Shape shapeCache =  shapeMap.get(shapeId);
       return (Shape) shapeCache.clone();
    }

    /**
     * 对每种形状都运行数据库查询，并创建该形状
     * 例如，我们要添加三种形状
     */
    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(),rectangle);
    }
}
