package com.lvt.pattern_18;

import java.util.Date;

/**
 * @Description: java类作用描述
 * @Author: LT
 * @CreateDate: 2019/11/25 17:15
 * @Version: 1.0.0
 */
public class ChatRoom {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString()+ " [" + user.getName() +"] : " + message);
    }

}
