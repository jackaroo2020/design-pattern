package com.lvt.pattern_06;

/**
 * @Description: java类作用描述
 * @Author: LT
 * @CreateDate: 2019/11/20 17:34
 * @Version: 1.0.0
 */
public class Mp4Player implements AdvancedMediaPlayer {
    public void playVlc(String fileName) {

    }

    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
