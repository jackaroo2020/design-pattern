package com.lvt.pattern_16;

/**
 * @Description: java类作用描述
 * @Author: LT
 * @CreateDate: 2019/11/25 16:46
 * @Version: 1.0.0
 */
public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    public boolean interpret(String context) {
        if (context.contains(data)) {
            return true;
        }
        return false;
    }

}
