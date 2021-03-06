package com.zouol.design.create.abstractfactory;

public abstract class AbstractFactory {
    public abstract Shape getShape(String shapeType);
    public abstract Color getColor(String color);
}
