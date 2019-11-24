package com.lvt.pattern_07;

/**
 * @Description: java类作用描述
 * @Author: LT
 * @CreateDate: 2019/11/20 17:55
 * @Version: 1.0.0
 */
public class GreenCircle implements DrawAPI {

    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}
