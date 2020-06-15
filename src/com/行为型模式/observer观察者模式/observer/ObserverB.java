package com.行为型模式.observer观察者模式.observer;

public class ObserverB extends Observer implements ObserverInterface{
    @Override
    public void getNewPhoneNo(String phoneNo) {
        System.out.println("Student B 获取到新手机号："+phoneNo+"，但是不添加通讯录。");
    }

    @Override
    public void callPhoneNo(String phoneNo) {
        System.out.println("Student B 没有添加通讯录，也没有打电话");
    }
}
