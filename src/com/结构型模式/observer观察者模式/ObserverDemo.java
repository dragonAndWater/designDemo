package com.结构型模式.observer观察者模式;

import com.结构型模式.observer观察者模式.observer.ObserverA;
import com.结构型模式.observer观察者模式.observer.ObserverB;
import com.结构型模式.observer观察者模式.observer.ObserverC;

public class ObserverDemo {


    public static void main(String[] args) {
        StudentSubject ss = new StudentSubject();
        ss.add(new ObserverA());
        ss.add(new ObserverB());
        ss.add(new ObserverC());
        ObserverA a = new ObserverA();
        System.out.println(ss.notify("15155555555"));

        a.callPhoneNo("15155555555");
    }



}
