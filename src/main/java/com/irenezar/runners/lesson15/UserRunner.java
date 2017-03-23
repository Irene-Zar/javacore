package com.irenezar.runners.lesson15;

import com.irenezar.app.classwork.lesson15.User;

/**
 * Created by new_user on 3/6/2017.
 */
public class UserRunner {
    public static void main(String[] args) {
        User user1 = new User();
        user1.setAge(20);
        user1.setName("name1");
        User user2 = new User();
        user2.setAge(20);
        user2.setName("name1");
        System.out.println(user1.equals(user2));
    }
}
