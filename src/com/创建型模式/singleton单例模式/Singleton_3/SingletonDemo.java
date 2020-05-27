package com.创建型模式.singleton单例模式.Singleton_3;

public class SingletonDemo {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.getMessage();
    }
}
