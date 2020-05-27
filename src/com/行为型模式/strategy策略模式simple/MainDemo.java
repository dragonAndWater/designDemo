package com.行为型模式.strategy策略模式simple;

public class MainDemo {
    Context context;

    public static void main(String[] args) {
        try {
            Context context = new Context(getStrategyClass("ClassOne"));
            context.getSomething();
            //此时获取到的对象是 Class One
            System.out.println("Class One 没有实现getInt(),但是还是会有结果，子类复用父类的具体实现方法");
            context.getInt();
            context.getString();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    //反射获取类
    public static Strategy getStrategyClass(String pmcNo) throws Exception {
        Class<?> reflect = Class.forName("com.行为型模式.strategy策略模式simple." + pmcNo);
        Object o = reflect.newInstance();
        return (Strategy) o;
    }

}
