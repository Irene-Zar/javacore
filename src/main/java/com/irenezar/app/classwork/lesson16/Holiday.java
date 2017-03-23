package com.irenezar.app.classwork.lesson16;

/**
 * Created by new_user on 3/9/2017.
 */
public enum Holiday {
    NEW_YEAR(1, "January","New Year"),EASTER(16,"April","Easter"), INDEPENDENCE_DAY(24,"August","Independence Day");
    private int date;
    private String month;
    private String holidayname;
    private Holiday (int date, String month, String holidayname) {
        this.date = date;
        this.month = month;
        this.holidayname = holidayname;
    }

    public int getDate() {
        return date;
    }
    public String getMonth(){
        return month;
    }
    public String getHolidayname(){
        return holidayname;
    }
}
