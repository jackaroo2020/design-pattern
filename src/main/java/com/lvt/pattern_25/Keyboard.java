package com.lvt.pattern_25;

/**
 * @Description: java类作用描述
 * @Author: LT
 * @CreateDate: 2019/11/30 1:30
 * @Version: 1.0.0
 */
public class Keyboard implements ComputerPart {

    public void accept(ComputerPartVistor computerPartVistor) {
        computerPartVistor.visit(this);
    }

}
