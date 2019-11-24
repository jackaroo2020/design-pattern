package com.lvt.pattern_08;

import java.util.List;

/**
 * @Description: java类作用描述
 * @Author: LT
 * @CreateDate: 2019/11/22 16:37
 * @Version: 1.0.0
 */
public class AndCriteriaImpl implements Criteria {

    private Criteria criteria;

    private Criteria otherCriteria;

    public AndCriteriaImpl(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstPersons = criteria.meetCriteria(persons);
        return otherCriteria.meetCriteria(firstPersons);
    }

}
