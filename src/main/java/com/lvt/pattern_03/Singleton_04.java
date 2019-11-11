package com.lvt.pattern_03;

/**
 * @Description: java类作用描述
 * 4、双检锁/双重校验锁（DCL，即 double-checked locking）
 * JDK 版本：JDK1.5 起
 * <p>
 * 是否 Lazy 初始化：是
 * <p>
 * 是否多线程安全：是
 * <p>
 * 实现难度：较复杂
 * <p>
 * 描述：这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
 * getInstance() 的性能对应用程序很关键。
 * @Author: LT
 * @CreateDate: 2019/11/11 16:29
 * @Version: 1.0.0
 */
public class Singleton_04 {

    private volatile static Singleton_04 instance;

    private Singleton_04() {

    }

    public static Singleton_04 getInstance() {
        if (instance == null) {
            synchronized (Singleton_04.class) {
                if (instance == null) {
                    instance = new Singleton_04();
                }
            }
        }
        return instance;
    }
}
