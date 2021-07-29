package com.zouol.design.create.abstractfactory.color;

import com.zouol.design.create.abstractfactory.Color;

public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("fill Red");
    }
}
