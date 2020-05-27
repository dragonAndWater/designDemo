package com.行为型模式.strategy策略模式simple;

public class ClassOne extends Strategy {
    @Override
    void getMthod() {
        System.out.println("Class One Method");
    }

    @Override
    public void getString() {
        System.out.println("Class One String");
    }
}
