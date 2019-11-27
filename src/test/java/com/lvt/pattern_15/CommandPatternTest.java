package com.lvt.pattern_15;

import org.junit.Test;

/**
 * @Description: java类作用描述
 * @Author: LT
 * @CreateDate: 2019/11/25 16:35
 * @Version: 1.0.0
 */
public class CommandPatternTest {

    @Test
    public void commandPatternTest() {
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrder();
    }
}
