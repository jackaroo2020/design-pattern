package com.lvt.pattern_20;

/**
 * @Description: java类作用描述
 * @Author: LT
 * @CreateDate: 2019/11/28 18:38
 * @Version: 1.0.0
 */
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    void update() {
        System.out.println("Binary String :"+Integer.toBinaryString(subject.getState()));
    }

}
