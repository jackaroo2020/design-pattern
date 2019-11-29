package com.lvt.pattern_25;

/**
 * @Description: java类作用描述
 * @Author: LT
 * @CreateDate: 2019/11/30 1:33
 * @Version: 1.0.0
 */
public class Mouse implements ComputerPart {

    public void accept(ComputerPartVistor computerPartVistor) {
        computerPartVistor.visit(this);
    }
}
