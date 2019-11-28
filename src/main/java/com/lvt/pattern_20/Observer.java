package com.lvt.pattern_20;

/**
 * @Description: java类作用描述
 * @Author: LT
 * @CreateDate: 2019/11/28 18:34
 * @Version: 1.0.0
 */
public abstract class Observer {

    protected Subject subject;

    abstract void update();
}
