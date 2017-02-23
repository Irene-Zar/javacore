package com.irenezar.runners.lesson11;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by new_user on 2/20/2017.
 */
public class FileReader {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(
                    new java.io.FileReader("D:\\KIT\\javacore\\src\\test\\resources\\inputforfilereader.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        }
         catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Regardless of the exception you will see this text");
        }
    }
}
