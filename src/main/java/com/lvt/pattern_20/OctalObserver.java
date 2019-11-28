package com.lvt.pattern_20;

/**
 * @Description: java类作用描述
 * @Author: LT
 * @CreateDate: 2019/11/28 18:40
 * @Version: 1.0.0
 */
public class OctalObserver extends Observer {

    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    void update() {
        System.out.println("OctalObserver String :"+Integer.toOctalString(subject.getState()));
    }
}
