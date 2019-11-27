package com.lvt.pattern_18;

import org.junit.Test;

/**
 * @Description: java类作用描述
 * @Author: LT
 * @CreateDate: 2019/11/25 17:16
 * @Version: 1.0.0
 */
public class MediatorPatternTest {

    @Test
    public void mediatorPatternTest() {
        User lt = new User("lt");
        User zhangsnan = new User("zhangsan");

        lt.sendMessage("hi 我来了");
        zhangsnan.sendMessage("hello lt");
    }
}
