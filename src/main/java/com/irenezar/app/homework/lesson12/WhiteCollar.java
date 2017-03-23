package com.irenezar.app.homework.lesson12;

import java.sql.Array;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by new_user on 3/2/2017.
 */
public class WhiteCollar extends Human {
    private String company;

    public  WhiteCollar(int age, String name, String company){
        super(age, name);
        this.company = company;
    }

    public void setCompany(String company) {
        Pattern p = Pattern.compile("[a-zA-Z-,]*|\\s*");
        Matcher m = p.matcher(company);
            if (m.matches()) {
                this.company = company;
                System.out.println("Company name set");
            } else {
                System.out.println("Company name is invalid");
            }
        }


    public String getCompany() {
        return company;
    }
}
