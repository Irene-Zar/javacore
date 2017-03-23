package com.irenezar.runners.lesson16;

import com.irenezar.app.classwork.lesson16.Holiday;

/**
 * Created by new_user on 3/9/2017.
 */
public class HolidayRunner {
    public static void main(String[] args) {
        for (Holiday cName : Holiday.values()){
            System.out.println(cName.getHolidayname()+" holiday is on "+ cName.getMonth()+","+cName.getDate());
        }
    }
}
