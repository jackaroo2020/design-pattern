package com.lvt.pattern_13;

import javax.imageio.ImageIO;

/**
 * @Description: java类作用描述
 * @Author: LT
 * @CreateDate: 2019/11/24 11:25
 * @Version: 1.0.0
 */
public class ProxyImage implements Image {

    private RealImage realImage;

    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
