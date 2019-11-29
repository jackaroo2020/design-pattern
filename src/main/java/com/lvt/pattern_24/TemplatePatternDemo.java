package com.lvt.pattern_24;

/**
 * @Description: java类作用描述
 * @Author: LT
 * @CreateDate: 2019/11/29 18:00
 * @Version: 1.0.0
 */
public class TemplatePatternDemo {

    public static void main(String[] args) {

        Game game = new Cricket();
        game.play();

        System.out.println();
        game = new Football();
        game.play();
    }
}
