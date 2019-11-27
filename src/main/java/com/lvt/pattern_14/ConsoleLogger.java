package com.lvt.pattern_14;

/**
 * @Description: java类作用描述
 * @Author: LT
 * @CreateDate: 2019/11/25 15:37
 * @Version: 1.0.0
 */
public class ConsoleLogger extends AbstractLogger {
    protected void write(String message) {
        System.out.println("Console::logger:"+message);
    }

    public ConsoleLogger(int level) {
        this.level = level;
    }
}
