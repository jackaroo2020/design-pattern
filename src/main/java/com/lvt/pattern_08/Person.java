package com.lvt.pattern_08;

import lombok.Data;

/**
 * @Description: java类作用描述
 * @Author: LT
 * @CreateDate: 2019/11/22 16:31
 * @Version: 1.0.0
 */
@Data
public class Person {

    /**
     * name
     */
    private String name;

    /**
     * gender
     */
    private String gender;

    /**
     * status
     */
    private String maritalStatus;

    public Person(String name, String gender, String maritalStatus) {
        this.name = name;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }
}
