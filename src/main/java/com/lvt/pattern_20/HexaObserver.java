package com.lvt.pattern_20;

/**
 * @Description: java类作用描述
 * @Author: LT
 * @CreateDate: 2019/11/28 18:41
 * @Version: 1.0.0
 */
public class HexaObserver extends Observer {

    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }


    void update() {
        System.out.println("Hex string:"+Integer.toHexString(subject.getState()).toUpperCase());
    }
}
