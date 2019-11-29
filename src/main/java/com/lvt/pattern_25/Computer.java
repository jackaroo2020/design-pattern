package com.lvt.pattern_25;

/**
 * @Description: java类作用描述
 * @Author: LT
 * @CreateDate: 2019/11/30 1:33
 * @Version: 1.0.0
 */
public class Computer implements ComputerPart {

    ComputerPart[] parts;

    public Computer() {
        parts = new ComputerPart[]{new Mouse(),new Keyboard(),new Monitor()};
    }

    public void accept(ComputerPartVistor computerPartVistor) {
        for (int i = 0; i < parts.length; i++) {
            parts[i].accept(computerPartVistor);
        }
        computerPartVistor.visit(this);
    }

}
