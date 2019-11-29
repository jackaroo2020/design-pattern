package com.lvt.pattern_21;

/**
 * @Description: java类作用描述
 * @Author: LT
 * @CreateDate: 2019/11/29 17:20
 * @Version: 1.0.0
 */
public class StatePatternDemo {

    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }
}
