package com.行为型模式.strategy策略模式simple;

public class ClassTwo extends Strategy {
    @Override
    void getMthod() {
        System.out.println("Class Two Method");
    }

    @Override
    public void getString() {
        System.out.println("Class Two get String");
    }
}
