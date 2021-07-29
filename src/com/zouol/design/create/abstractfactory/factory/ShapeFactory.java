package com.zouol.design.create.abstractfactory.factory;

import com.zouol.design.create.abstractfactory.AbstractFactory;
import com.zouol.design.create.abstractfactory.Color;
import com.zouol.design.create.abstractfactory.Shape;
import com.zouol.design.create.abstractfactory.shape.Circle;
import com.zouol.design.create.abstractfactory.shape.Rectangle;
import com.zouol.design.create.abstractfactory.shape.Square;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
