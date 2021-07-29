package com.zouol.design.create.factory;

import com.zouol.design.create.factory.shape.Circle;
import com.zouol.design.create.factory.shape.Rectangle;
import com.zouol.design.create.factory.shape.Square;

public class ShapeFactory {
    public Shape getShape(String shapeType){
        if (shapeType == null){
            return null;
        }
        if (shapeType.equals("CIRCLE")){
            return new Circle();
        }
        if (shapeType.equals("RECTANGLE")){
            return new Rectangle();
        }
        if (shapeType.equals("SQUARE")){
            return new Square();
        }
        return null;
    }
}
