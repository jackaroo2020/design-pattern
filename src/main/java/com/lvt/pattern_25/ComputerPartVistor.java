package com.lvt.pattern_25;


/**
 * @Description: java类作用描述
 * @Author: LT
 * @CreateDate: 2019/11/30 1:30
 * @Version: 1.0.0
 */
public interface ComputerPartVistor {

    void visit(Computer computer);

    void visit(Mouse mouse);

    void visit(Keyboard keyboard);

    void visit(Monitor monitor);

}
