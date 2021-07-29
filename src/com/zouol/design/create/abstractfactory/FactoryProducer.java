package com.zouol.design.create.abstractfactory;

import com.zouol.design.create.abstractfactory.factory.ColorFactory;
import com.zouol.design.create.abstractfactory.factory.ShapeFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        } else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }
}
