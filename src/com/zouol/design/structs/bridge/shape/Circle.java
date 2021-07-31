package com.zouol.design.structs.bridge.shape;

import com.zouol.design.structs.bridge.DrawAPI;
import com.zouol.design.structs.bridge.Shape;

public class Circle extends Shape {
    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void draw() {
        drawAPI.drawCircle(radius,x,y);
    }
}
