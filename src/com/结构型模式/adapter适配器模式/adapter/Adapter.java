package com.结构型模式.adapter适配器模式.adapter;

import com.结构型模式.adapter适配器模式.model.AdapterInter;
import com.结构型模式.adapter适配器模式.model.Mp4Player;
import com.结构型模式.adapter适配器模式.model.OtherPlayer;
import com.结构型模式.adapter适配器模式.model.VlcPlayer;

/**
 * @Author longtao
 * @Date   2020/6/15
 * @Describe
 * 适配器
 **/
public class Adapter implements AdapterInter {

    private String type;
    OtherPlayer otherPlayer;

    public Adapter(String type) {
        this.type = type;
        if("MP4".equals(type)){
            otherPlayer = new Mp4Player();
        }else if("VLC".equals(type)){
            otherPlayer = new VlcPlayer();
        }

    }

    @Override
    public void play() {
        if("MP4".equals(type)){
            otherPlayer.Mp4();
        }else if("VLC".equals(type)){
            otherPlayer.Vlc();
        }

    }
}
