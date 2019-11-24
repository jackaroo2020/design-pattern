package com.lvt.pattern_13;

import org.junit.Test;

/**
 * @Description: java类作用描述
 * @Author: LT
 * @CreateDate: 2019/11/24 11:27
 * @Version: 1.0.0
 */
public class ProxyPatternTest {

    @Test
    public void proxyPatternTest() {
        Image image = new ProxyImage("test_10.jpg");

        // 图像将从磁盘加载
        image.display();
        System.out.println("");

        // 图像不需要从磁盘加载
        image.display();
    }
}
