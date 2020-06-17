package com.结构型模式.decorator装饰模式;

import com.结构型模式.decorator装饰模式.model.Shape;

public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw(){
        shape.draw();
        setRedBorder(shape);
    }
    private void setRedBorder(Shape shape){
        System.out.println(" Red ");
    }
}
