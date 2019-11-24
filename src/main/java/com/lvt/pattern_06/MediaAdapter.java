package com.lvt.pattern_06;

/**
 * @Description: 创建实现了 MediaPlayer 接口的适配器类
 * @Author: LT
 * @CreateDate: 2019/11/20 17:35
 * @Version: 1.0.0
 */
public class MediaAdapter implements MediaPlayer{

    private  AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("vlc") ){
            advancedMusicPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer = new Mp4Player();
        }
    }

    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMusicPlayer.playVlc(fileName);
        }else if(audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer.playMp4(fileName);
        }
    }
}
