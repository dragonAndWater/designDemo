package com.行为型模式.strategy策略模式simple;
/**
 * @Author longtao
 * @Date   2020/5/27
 * @Describe
 *
 * 抽象方法实现接口，所有的子类都必须重写接口里的方法
 **/
abstract class Strategy implements StrategyInterface{
    //抽象方法
    abstract void getMthod();

    public void getInt(){
        System.out.println("Strategy get int !");
    }
}
