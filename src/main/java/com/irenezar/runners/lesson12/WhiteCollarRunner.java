package com.irenezar.runners.lesson12;
import com.irenezar.app.homework.lesson12.WhiteCollar;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by new_user on 3/2/2017.
 */
public class WhiteCollarRunner {
    public static void main(String[] args) {
        WhiteCollar whiteCollar = new WhiteCollar(35, "Jane", "ACME");
        System.out.println("Enter company name");
        Scanner scanner = new Scanner(System.in);
        String companyName = scanner.next();
        whiteCollar.setCompany(companyName);
        whiteCollar.getCompany();
    }
}
