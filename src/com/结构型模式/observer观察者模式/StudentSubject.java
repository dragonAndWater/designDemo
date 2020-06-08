package com.结构型模式.observer观察者模式;

import com.结构型模式.observer观察者模式.observer.Observer;
import com.结构型模式.observer观察者模式.observer.ObserverInterface;

import java.util.ArrayList;
import java.util.List;

public class StudentSubject {
    private List<Observer> list = new ArrayList<Observer>();

    public void add(Observer observer){
        list.add(observer);
    }

    public void remove(Observer observer){
        list.remove(observer);
    }

    public String notify(String phoneNo){
        for(Observer o:list){
            o.getNewPhoneNo(phoneNo);
        }
        return "通知了全部同学";
    }
}
