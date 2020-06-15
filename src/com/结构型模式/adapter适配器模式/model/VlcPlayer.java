package com.结构型模式.adapter适配器模式.model;

public class VlcPlayer implements OtherPlayer {
    @Override
    public void Mp4() {

    }

    @Override
    public void Vlc() {
        System.out.println("播放 Vlc");
    }
}
