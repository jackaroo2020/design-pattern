package com.lvt.common;

import lombok.Getter;

/**
 * @Description: * @Description: 形状枚举类
 * * 　JDK1.6之前的switch语句只支持int,char,enum类型，使用枚举，能让我们的代码可读性更强。
 * @Author: LT
 * @CreateDate: 2019/11/6 22:31
 * @Version: 1.0.0
 */
@Getter
public enum ShapeEnum {
    CIRCLE("圆形",1),
    RECTANGELE("长方形",2),
    SQURE("方形",3);

    /**
     * 形状名称
     */
    private String name;

    /**
     * 索引
     */
    private int index;

    ShapeEnum(String name, int index) {
        this.name = name;
        this.index = index;
    }

    /**
     * 获取形状名称
     *
     * @param index
     * @return
     */
    public static String getShapeName(int index) {
        for (ShapeEnum c : ShapeEnum.values()) {
            if (c.getIndex() == index) {
                return c.getName();
            }
        }
        return null;
    }

    /**
     * 获取形状索引
     *
     * @param name
     * @return
     */
    public static int getShapeIndex(String name) {
        for (ShapeEnum c : ShapeEnum.values()) {
            if (c.getName().equals(name)) {
                return c.getIndex();
            }
        }
        return -1;
    }

}
