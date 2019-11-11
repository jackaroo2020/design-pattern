package com.lvt.pattern_03;

/**
 * @Description:
 * 1、懒汉式，线程不安全
 * 是否 Lazy 初始化：是
 *
 * 是否多线程安全：否
 *
 * 实现难度：易
 *
 * 描述：这种方式是最基本的实现方式，这种实现最大的问题就是不支持多线程。因为没有加锁 synchronized，所以严格意义上它并不算单例模式。
 * 这种方式 lazy loading 很明显，不要求线程安全，在多线程不能正常工作。
 * @Author: LT
 * @CreateDate: 2019/11/11 16:09
 * @Version: 1.0.0
 */
public class Singleton_01 {

    private static Singleton_01 instance;

    private Singleton_01() {}

    public static Singleton_01 getInstance() {
        if (instance == null) {
            instance = new Singleton_01();
        }
        return instance;
    }
}
