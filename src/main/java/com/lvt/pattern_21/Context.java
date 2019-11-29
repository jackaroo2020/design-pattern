package com.lvt.pattern_21;

/**
 * @Description: java类作用描述
 * @Author: LT
 * @CreateDate: 2019/11/29 17:03
 * @Version: 1.0.0
 */
public class Context {

    private State state;

    public Context() {
        state = null;
    }

    public void setState (State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

}
