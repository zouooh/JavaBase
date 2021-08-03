package com.zouol.design.behavoir.command.cmd;

import com.zouol.design.behavoir.command.Order;
import com.zouol.design.behavoir.command.Stock;

public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.buy();
    }
}
