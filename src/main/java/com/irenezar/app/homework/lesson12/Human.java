package com.irenezar.app.homework.lesson12;

/**
 * Created by new_user on 3/2/2017.
 */
public class Human {
    private int age;
    private String name;

    public Human (int age, String name){
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 1 & age <= 120) {
            this.age = age;
            System.out.println("New age set");
        }
        else {
            System.out.println("Age invalid");
        }
    }

    public String getName() {
        return name;
    }

}
