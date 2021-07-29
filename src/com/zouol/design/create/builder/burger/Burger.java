package com.zouol.design.create.builder.burger;

import com.zouol.design.create.builder.Item;
import com.zouol.design.create.builder.Packing;
import com.zouol.design.create.builder.pack.Wrapper;

public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
