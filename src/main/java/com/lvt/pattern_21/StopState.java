package com.lvt.pattern_21;


/**
 * @Description: java类作用描述
 * @Author: LT
 * @CreateDate: 2019/11/29 17:01
 * @Version: 1.0.0
 */
public class StopState implements State {

    public void doAction(Context context) {
        System.out.println("game is stop");
        context.setState(this);
    }

    public String toString() {
        return "Stop State";
    }
}
