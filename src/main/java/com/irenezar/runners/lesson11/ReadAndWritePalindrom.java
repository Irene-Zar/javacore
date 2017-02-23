package com.irenezar.runners.lesson11;

import com.irenezar.app.homework.lesson9.PalindromeCheckWithStringbuilder;

import java.io.*;

/**
 * Created by new_user on 2/20/2017.
 */
public class ReadAndWritePalindrom {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(
                    new java.io.FileReader("D:\\KIT\\javacore\\src\\test\\resources\\palindrome.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                if (PalindromeCheckWithStringbuilder.definepalindrome(line) == "Palindrome") {
                    System.out.println("Palindrome");
                } else {
                    BufferedWriter writer = new BufferedWriter(
                            new OutputStreamWriter(new FileOutputStream("D:\\KIT\\javacore\\src\\test\\resources\\notpalindrome.txt")));
                    writer.append(line);
                    writer.close();
                }
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
