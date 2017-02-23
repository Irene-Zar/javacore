package com.irenezar.runners.lesson11;

import com.irenezar.app.homework.lesson9.PalindromeCheckWithStringbuilder;

import java.io.*;
import java.util.Scanner;

/**
 * Created by new_user on 2/23/2017.
 */
public class WriteTextToFileFromConsole {
     public static void main(String[] args) {
         System.out.println("Enter lines of text. To exit enter *exit*:");
         String text = "";
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         try {
             BufferedWriter writer = new BufferedWriter(
                     new OutputStreamWriter(new FileOutputStream("D:\\KIT\\javacore\\src\\test\\resources\\textfromconsole.txt")));
             while (!(text = reader.readLine()).equals("*exit*"))
                 {
                     writer.append(text);
                     writer.newLine();
                 }
             writer.close();
             reader.close();
         } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
