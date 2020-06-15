package com.行为型模式.observer观察者模式.observer;

public class ObserverC extends Observer implements ObserverInterface{
    @Override
    public void getNewPhoneNo(String phoneNo) {
        System.out.println("student C 获取到手机号："+phoneNo+"，添加通讯录一半，手机没电了");
    }

    @Override
    public void callPhoneNo(String phoneNo) {
        System.out.println("Student B 添加通讯录一半，手机没电了"+phoneNo+"，是因为给这个号码打电话了");
    }
}
