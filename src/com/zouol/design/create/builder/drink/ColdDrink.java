package com.zouol.design.create.builder.drink;

import com.zouol.design.create.builder.Item;
import com.zouol.design.create.builder.Packing;
import com.zouol.design.create.builder.pack.Bottle;

public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
