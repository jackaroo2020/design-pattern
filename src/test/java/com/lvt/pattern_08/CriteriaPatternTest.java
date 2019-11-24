package com.lvt.pattern_08;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: java类作用描述
 * @Author: LT
 * @CreateDate: 2019/11/22 16:56
 * @Version: 1.0.0
 */
public class CriteriaPatternTest {

    @Test
    public void criteriaPatterTest() {
        List<Person> persons = new ArrayList<Person>();

        persons.add(new Person("Robert", "Male", "Single"));
        persons.add(new Person("John", "Male", "Married"));
        persons.add(new Person("Laura", "Female", "Married"));
        persons.add(new Person("Diana", "Female", "Single"));
        persons.add(new Person("Mike", "Male", "Single"));
        persons.add(new Person("Bobby", "Male", "Single"));

        Criteria male = new CriteriaIMalempl();
        Criteria female = new CriteriaIFemalempl();
        Criteria single = new CriteriaSingleImpl();
        Criteria singleMale = new AndCriteriaImpl(single, male);
        Criteria singleOrFemale = new OrCriteriaImpl(single, female);

        System.out.println("Males: ");
        printPersons(male.meetCriteria(persons));

        System.out.println("\nFemales: ");
        printPersons(female.meetCriteria(persons));

        System.out.println("\nSingle Males: ");
        printPersons(singleMale.meetCriteria(persons));

        System.out.println("\nSingle Or Females: ");
        printPersons(singleOrFemale.meetCriteria(persons));
    }

    public static void printPersons(List<Person> persons){
        for (Person person : persons) {
            System.out.println("Person : [ Name : " + person.getName()
                    +", Gender : " + person.getGender()
                    +", Marital Status : " + person.getMaritalStatus()
                    +" ]");
        }
    }
}
