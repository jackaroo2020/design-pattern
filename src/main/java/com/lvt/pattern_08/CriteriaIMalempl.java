package com.lvt.pattern_08;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: java类作用描述
 * @Author: LT
 * @CreateDate: 2019/11/22 16:33
 * @Version: 1.0.0
 */
public class CriteriaIMalempl implements Criteria {
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersions = new ArrayList<Person>();

        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("MALE")) {
                malePersions.add(person);
            }
        }
        return malePersions;
    }
}
