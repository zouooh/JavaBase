package com.zouol.design.create.abstractfactory.shape;


import com.zouol.design.create.abstractfactory.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw Rectangle");
    }
}
