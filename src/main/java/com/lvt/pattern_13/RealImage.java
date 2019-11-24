package com.lvt.pattern_13;

/**
 * @Description: java类作用描述
 * @Author: LT
 * @CreateDate: 2019/11/24 11:24
 * @Version: 1.0.0
 */
public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    private void loadFromDisk(String fileName) {
        System.out.println("Loading:"+fileName);
    }

    public void display() {
        System.out.println("Displaying:"+fileName);
    }
}
