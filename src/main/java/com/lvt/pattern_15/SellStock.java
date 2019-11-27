package com.lvt.pattern_15;

/**
 * @Description: java类作用描述
 * @Author: LT
 * @CreateDate: 2019/11/25 16:32
 * @Version: 1.0.0
 */
public class SellStock implements Order {

    private Stock abcStock;

    public SellStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.sell();
    }
}
