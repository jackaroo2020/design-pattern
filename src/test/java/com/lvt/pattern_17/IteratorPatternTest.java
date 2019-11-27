package com.lvt.pattern_17;

import org.junit.Test;

/**
 * @Description: java类作用描述
 * @Author: LT
 * @CreateDate: 2019/11/25 17:06
 * @Version: 1.0.0
 */
public class IteratorPatternTest {

    @Test
    public void iteratorPatternTest() {
        NameRepository nameRepository = new NameRepository();

        for (Iterator iterator= nameRepository.getIterator();iterator.hasNext();) {
            String name = (String) iterator.next();
            System.out.println("Name:"+name);
        }
    }

}
