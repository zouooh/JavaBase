package com.zouol.design.create.abstractfactory.factory;

import com.zouol.design.create.abstractfactory.AbstractFactory;
import com.zouol.design.create.abstractfactory.Color;
import com.zouol.design.create.abstractfactory.Shape;
import com.zouol.design.create.abstractfactory.color.Blue;
import com.zouol.design.create.abstractfactory.color.Green;
import com.zouol.design.create.abstractfactory.color.Red;
import com.zouol.design.create.abstractfactory.shape.Circle;
import com.zouol.design.create.abstractfactory.shape.Rectangle;
import com.zouol.design.create.abstractfactory.shape.Square;

public class ColorFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType){
        return null;
    }

    @Override
    public Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        } else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        } else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }
}
