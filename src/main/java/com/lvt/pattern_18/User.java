package com.lvt.pattern_18;

import lombok.Data;

/**
 * @Description: java类作用描述
 * @Author: LT
 * @CreateDate: 2019/11/25 17:15
 * @Version: 1.0.0
 */
@Data
public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {
        ChatRoom.showMessage(this,message);
    }
}
