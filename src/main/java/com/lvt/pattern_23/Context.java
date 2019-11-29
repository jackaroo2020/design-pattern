package com.lvt.pattern_23;

/**
 * @Description: java类作用描述
 * @Author: LT
 * @CreateDate: 2019/11/29 17:46
 * @Version: 1.0.0
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1,int num2) {
        return strategy.doOperation(num1,num2);
    }

}
