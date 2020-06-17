package com.结构型模式.decorator装饰模式.model;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("画一个圆形");
    }
}
