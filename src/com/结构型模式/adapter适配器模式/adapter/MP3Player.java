package com.结构型模式.adapter适配器模式.adapter;
/**
 * @Author longtao
 * @Date   2020/6/15
 * @Describe
 * 能播放 mp3 格式音乐
 **/
public class MP3Player {
    Adapter adapter;
    public void play(String type){
        if("MP3".equals(type)){
            System.out.println("播放 MP3");
        }else if("MP4".equals(type) || "VLC".equals(type)){
            adapter = new Adapter(type);
            adapter.play();
        }else{
            System.out.println("暂不支持改音乐格式"+type);
        }


    }
}
