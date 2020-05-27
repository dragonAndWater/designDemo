package com.结构型模式.facade外观模式;

import com.结构型模式.facade外观模式.FacadeClass.FacadeDemo;
/**
 * @Author longtao
 * @Date   2020/5/27
 * @Describe
 * 外观模式：
 *      个人感觉，外观类就是包装一系列接口，组合成一个含有更多功能的外层接口
 **/
public class MainDemo {
    public static void main(String[] args) {
        FacadeDemo f = new FacadeDemo();
        System.out.println("调用外观类方法:getMethodOne");
        f.getMethodOne();
        System.out.println("调用外观类方法:getMethodTwo");
        f.getMethodTwo();
    }
}
