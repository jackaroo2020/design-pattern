package com.lvt.pattern_15;

/**
 * @Description: java类作用描述
 * @Author: LT
 * @CreateDate: 2019/11/25 16:31
 * @Version: 1.0.0
 */
public class BuyStock implements Order {

    private Stock abcStock;

    public BuyStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    public void execute() {
     abcStock.buy();
    }
}
