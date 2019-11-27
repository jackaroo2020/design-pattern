package com.lvt.pattern_15;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: java类作用描述
 * @Author: LT
 * @CreateDate: 2019/11/25 16:33
 * @Version: 1.0.0
 */
public class Broker {

    private List<Order> oderList = new ArrayList<Order>();

    public void takeOrder(Order order) {
        oderList.add(order);
    }

    public void placeOrder( ) {
        for (Order order : oderList) {
            order.execute();
        }
        oderList.clear();
    }

}
