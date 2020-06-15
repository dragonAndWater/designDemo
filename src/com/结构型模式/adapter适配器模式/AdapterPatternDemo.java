package com.结构型模式.adapter适配器模式;

import com.结构型模式.adapter适配器模式.adapter.MP3Player;

public class AdapterPatternDemo {
    public static void main(String[] args) {

        MP3Player mp3 = new MP3Player();

        mp3.play("MP3");
        mp3.play("MP4");
        mp3.play("VLC");
        mp3.play("MP5");
    }
}
