package com.zouol.design.create.prototype.shape;

import com.zouol.design.create.prototype.Shape;

public class Square extends Shape {

    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
