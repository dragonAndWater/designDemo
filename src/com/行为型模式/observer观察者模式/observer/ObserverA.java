package com.行为型模式.observer观察者模式.observer;

public class ObserverA extends Observer implements ObserverInterface{
    @Override
    public void getNewPhoneNo(String phoneNo) {
        System.out.println("student A 获取到了新手机号:"+ phoneNo+",添加了通讯录");
    }

    @Override
    public void callPhoneNo(String phoneNo) {
        System.out.println("student A 根据手机号打了电话"+ phoneNo);
    }
}
