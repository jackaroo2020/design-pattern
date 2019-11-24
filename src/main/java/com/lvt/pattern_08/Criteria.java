package com.lvt.pattern_08;

import java.util.List;

/**
 * @Description: java类作用描述
 * @Author: LT
 * @CreateDate: 2019/11/22 16:32
 * @Version: 1.0.0
 */
public interface Criteria {

    List<Person> meetCriteria(List<Person> persons);
}
