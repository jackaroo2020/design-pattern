package com.lvt.common;


import lombok.Getter;

/**
 * @Description: 颜色枚举类
 * 　JDK1.6之前的switch语句只支持int,char,enum类型，使用枚举，能让我们的代码可读性更强。
 * @Author: LT
 * @CreateDate: 2019/11/6 7:57
 * @Version: 1.0.0
 */
@Getter
public enum ColorEnum {

    RED("红色",1),
    BULE("蓝色",2),
    GREEN("绿色",3);

    /**
     * 颜色名称
     */
    private String name;

    /**
     * 索引
     */
    private int index;

    ColorEnum(String name, int index) {
        this.name = name;
        this.index = index;
    }

    /**
     * 获取颜色名称
     *
     * @param index
     * @return
     */
    public static String getColorName(int index) {
        for (ColorEnum c: ColorEnum.values()) {
            if (c.getIndex() == index) {
                return c.getName();
            }
        }
        return null;
    }

    /**
     * 获取颜色索引
     *
     * @param name
     * @return
     */
    public static int getColorIndex(String name) {
        for (ColorEnum c: ColorEnum.values()) {
            if (c.getName().equals(name)) {
                return c.getIndex();
            }
        }
        return -1;
    }

}
