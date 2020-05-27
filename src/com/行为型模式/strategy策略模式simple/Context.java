package com.行为型模式.strategy策略模式simple;

public class Context {

    Strategy s;

    public Context(Strategy s) {
        this.s = s;
    }

    public void getSomething(){
        s.getMthod();
    }

    public void getInt(){
        s.getInt();
    }

    public void getString(){
        s.getString();
    }
}
