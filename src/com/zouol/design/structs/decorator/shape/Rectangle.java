package com.zouol.design.structs.decorator.shape;

import com.zouol.design.structs.decorator.Shape;

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
