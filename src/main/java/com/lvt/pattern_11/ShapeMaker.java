package com.lvt.pattern_11;

/**
 * @Description: java类作用描述
 * @Author: LT
 * @CreateDate: 2019/11/24 10:31
 * @Version: 1.0.0
 */
public class ShapeMaker {

    private Shape circle ;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
    public void drawSquare(){
        square.draw();
    }
}
