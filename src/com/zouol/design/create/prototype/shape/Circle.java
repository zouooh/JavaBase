package com.zouol.design.create.prototype.shape;

import com.zouol.design.create.prototype.Shape;

public class Circle extends Shape {

    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
