package com.zouol.design.create.abstractfactory.color;

import com.zouol.design.create.abstractfactory.Color;

public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("fill Green");
    }
}
