package com.lvt.pattern_08;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: java类作用描述
 * @Author: LT
 * @CreateDate: 2019/11/22 16:52
 * @Version: 1.0.0
 */
public class CriteriaSingleImpl implements Criteria {

    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getMaritalStatus().equalsIgnoreCase("SINGLE")){
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
