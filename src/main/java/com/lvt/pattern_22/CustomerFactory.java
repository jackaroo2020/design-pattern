package com.lvt.pattern_22;

/**
 * @Description: java类作用描述
 * @Author: LT
 * @CreateDate: 2019/11/29 17:35
 * @Version: 1.0.0
 */
public class CustomerFactory {

    public static final String[] names = {"Rob", "Joe", "Julie"};

    public static AbstractCustomer getCustomer(String name) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(name)) {
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}