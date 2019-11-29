package com.lvt.pattern_22;

/**
 * @Description: java类作用描述
 * @Author: LT
 * @CreateDate: 2019/11/29 17:31
 * @Version: 1.0.0
 */
public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name) {
        this.name = name;
    }

    boolean isNil() {
        return false;
    }

    String getName() {
        return name;
    }
}
