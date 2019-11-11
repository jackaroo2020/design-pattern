package com.lvt.pattern_05;

/**
 * @Description: java类作用描述
 * @Author: LT
 * @CreateDate: 2019/11/11 17:27
 * @Version: 1.0.0
 */
public abstract class Shape implements Cloneable {

    private String id;

    protected String type;

    abstract void draw();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     * @see Cloneable
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
