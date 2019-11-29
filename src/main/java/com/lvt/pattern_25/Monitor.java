package com.lvt.pattern_25;

/**
 * @Description: java类作用描述
 * @Author: LT
 * @CreateDate: 2019/11/30 1:32
 * @Version: 1.0.0
 */
public class Monitor implements ComputerPart {

    public void accept(ComputerPartVistor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }

}
