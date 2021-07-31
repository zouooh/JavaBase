package com.zouol.design.structs.decorator;

import com.zouol.design.structs.decorator.decorator.RedShapeDecorator;
import com.zouol.design.structs.decorator.shape.Circle;
import com.zouol.design.structs.decorator.shape.Rectangle;

/**
 * 装饰器模式（Decorator Pattern）允许向一个现有的对象添加新的功能，同时又不改变其结构。这种类型的设计模式属于结构型模式，它是作为现有的类的一个包装。
 */
public class DecoratorDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        //dShapeDecorator redCircle = new RedShapeDecorator(new Circle());
        ShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());
        Shape redCircle = new RedShapeDecorator(new Circle());
        //Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
