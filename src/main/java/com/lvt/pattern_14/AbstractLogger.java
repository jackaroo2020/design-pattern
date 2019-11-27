package com.lvt.pattern_14;

/**
 * @Description: java类作用描述
 * @Author: LT
 * @CreateDate: 2019/11/25 15:32
 * @Version: 1.0.0
 */
public abstract  class AbstractLogger {

    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    protected int level;

    // 责任链的下一个元素
    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level,String message) {
        if (this.level <= level) {
            write(message);
        }
        if (nextLogger != null) {
            nextLogger.logMessage(level,message);
        }
    }

    abstract protected void write(String message);
}
