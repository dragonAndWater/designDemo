package com.创建型模式.singleton单例模式.Singleton_6;

public class SingletonDemo {
    public static void main(String[] args) {
        Singleton singleton = Singleton.INSTANCE;
        singleton.getMessage();
    }
}
