package com.zouol.design.create.abstractfactory.shape;


import com.zouol.design.create.abstractfactory.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw Circle");
    }
}
