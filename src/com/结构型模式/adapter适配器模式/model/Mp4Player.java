package com.结构型模式.adapter适配器模式.model;

public class Mp4Player implements OtherPlayer {
    @Override
    public void Mp4() {
        System.out.println("播放 MP4");
    }

    @Override
    public void Vlc() {

    }
}
