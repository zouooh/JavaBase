package com.zouol.design.behavoir.command.cmd;

import com.zouol.design.behavoir.command.Order;
import com.zouol.design.behavoir.command.Stock;

public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.sell();
    }
}
