package com.zouol.design.create.factory.shape;


import com.zouol.design.create.factory.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw Circle");
    }
}
