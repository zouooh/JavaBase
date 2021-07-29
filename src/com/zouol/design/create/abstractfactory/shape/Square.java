package com.zouol.design.create.abstractfactory.shape;


import com.zouol.design.create.abstractfactory.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw Square");
    }
}
