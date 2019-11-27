package com.lvt.pattern_14;

/**
 * @Description: java类作用描述
 * @Author: LT
 * @CreateDate: 2019/11/25 15:39
 * @Version: 1.0.0
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level) {
        this.level = level;
    }

    protected void write(String message) {
        System.out.println("File logger:"+message);
    }
}
