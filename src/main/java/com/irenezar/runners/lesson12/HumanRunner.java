package com.irenezar.runners.lesson12;

import com.irenezar.app.homework.lesson12.Human;

/**
 * Created by new_user on 3/2/2017.
 */
public class HumanRunner {
    public static void main(String[] args) {
        Human human = new Human(28, "Andrew");
        System.out.println(human.getAge());
        System.out.println(human.getName());
        human.setAge(128);
        System.out.println(human.getAge());
    }
}
