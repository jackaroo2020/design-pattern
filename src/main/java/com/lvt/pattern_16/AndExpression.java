package com.lvt.pattern_16;

/**
 * @Description: java类作用描述
 * @Author: LT
 * @CreateDate: 2019/11/25 16:48
 * @Version: 1.0.0
 */
public class AndExpression implements Expression {

    private Expression expression1 = null;
    private Expression expression2 = null;

    public AndExpression(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    public boolean interpret(String context) {
        return expression1.interpret(context) && expression2.interpret(context);
    }
}
