package com.lvt.pattern_21;


/**
 * @Description: java类作用描述
 * @Author: LT
 * @CreateDate: 2019/11/29 16:57
 * @Version: 1.0.0
 */
public class StartState implements State {
    public void doAction(Context context) {
        System.out.println("game is start");
        context.setState(this);
    }

    public String toString() {
        return "Start State";
    }

}
