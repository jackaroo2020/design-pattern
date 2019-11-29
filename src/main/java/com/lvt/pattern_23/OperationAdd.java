package com.lvt.pattern_23;

/**
 * @Description: java类作用描述
 * @Author: LT
 * @CreateDate: 2019/11/29 17:45
 * @Version: 1.0.0
 */
public class OperationAdd implements Strategy {
    public int doOperation(int num1, int num2) {
        return num1+num1;
    }
}
