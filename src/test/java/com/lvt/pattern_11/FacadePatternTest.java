package com.lvt.pattern_11;

import org.junit.Test;

public class FacadePatternTest {

    @Test
    public void FacadePatternTest() {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }

}