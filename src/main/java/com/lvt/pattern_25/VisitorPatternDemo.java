package com.lvt.pattern_25;

/**
 * @Description: java类作用描述
 * @Author: LT
 * @CreateDate: 2019/11/30 1:41
 * @Version: 1.0.0
 */
public class VisitorPatternDemo {

    public static void main(String[] args) {
        ComputerPart computerPart = new Computer();

        computerPart.accept(new ComputerPartDisplayVistor());
    }
}
