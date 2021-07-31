package com.zouol.design.structs.facade;


import com.zouol.design.structs.facade.shape.Circle;
import com.zouol.design.structs.facade.shape.Rectangle;
import com.zouol.design.structs.facade.shape.Square;

public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
    public void drawSquare(){
        square.draw();
    }
}
