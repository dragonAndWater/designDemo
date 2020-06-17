package com.结构型模式.decorator装饰模式;

import com.结构型模式.decorator装饰模式.model.Shape;

abstract class ShapeDecorator implements Shape {
    Shape shape;

    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw() {
        shape.draw();
    }
}
