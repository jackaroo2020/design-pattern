package com.lvt.pattern_19;

/**
 * @Description: java类作用描述
 * @Author: LT
 * @CreateDate: 2019/11/28 18:14
 * @Version: 1.0.0
 */
public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
