package com.lvt.pattern_25;

/**
 * @Description: java类作用描述
 * @Author: LT
 * @CreateDate: 2019/11/30 1:39
 * @Version: 1.0.0
 */
public class ComputerPartDisplayVistor implements ComputerPartVistor {
    public void visit(Computer computer) {
        System.out.println("Displaying computer");
    }

    public void visit(Mouse mouse) {
        System.out.println("Displaying mouse");
    }

    public void visit(Keyboard keyboard) {
        System.out.println("Displaying keyboard");
    }

    public void visit(Monitor monitor) {
        System.out.println("Displaying monitor");
    }
}
