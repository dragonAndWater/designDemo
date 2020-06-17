package com.结构型模式.decorator装饰模式;

import com.结构型模式.decorator装饰模式.model.Circle;
import com.结构型模式.decorator装饰模式.model.Rectangle;
import com.结构型模式.decorator装饰模式.model.Shape;

public class DecoratorPatternDemo {
    public static void main(String[] args) {

        Shape circle = new Circle();
        ShapeDecorator redCircle = new RedShapeDecorator(new Circle());
        ShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
