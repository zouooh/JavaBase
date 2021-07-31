package com.zouol.design.structs.facade.shape;

import com.zouol.design.structs.facade.Shape;

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}
