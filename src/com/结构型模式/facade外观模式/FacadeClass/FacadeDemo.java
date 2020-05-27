package com.结构型模式.facade外观模式.FacadeClass;

import com.结构型模式.facade外观模式.someClass.ClassFour;
import com.结构型模式.facade外观模式.someClass.ClassOne;
import com.结构型模式.facade外观模式.someClass.ClassThree;
import com.结构型模式.facade外观模式.someClass.ClassTwo;

/**
 * @Author longtao
 * @Date   2020/5/27
 * @Describe
 * 外观模式：外观类，门面类
 **/
public class FacadeDemo {
    ClassOne one = new ClassOne();
    ClassTwo two = new ClassTwo();
    ClassThree three = new ClassThree();
    ClassFour four = new ClassFour();


    /**
     * @Author longtao
     * @Date   2020/5/27
     * @Describe
     *  外观类组合一系列下层接口
     **/
    public void getMethodOne() {
        System.out.println("getMethodOne");
        one.methodOne();
        three.methodTwo();
        four.methodThree();
    }

    public void getMethodTwo(){
        System.out.println("getMethodTwo");
        two.methodOne();
        three.methodTwo();
        four.methodThree();
        four.methodFour();
    }



}
