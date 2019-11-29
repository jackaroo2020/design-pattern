package com.lvt.pattern_22;

/**
 * @Description: java类作用描述
 * @Author: LT
 * @CreateDate: 2019/11/29 17:33
 * @Version: 1.0.0
 */
public class NullCustomer extends AbstractCustomer {

    boolean isNil() {
        return true;
    }

    String getName() {
        return "Not Available in Customer Database";
    }
}
