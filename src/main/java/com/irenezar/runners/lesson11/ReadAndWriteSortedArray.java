package com.irenezar.runners.lesson11;

import java.io.*;
import java.util.Arrays;

/**
 * Created by new_user on 2/20/2017.
 */
public class ReadAndWriteSortedArray {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(
                    new java.io.FileReader("D:\\KIT\\javacore\\src\\test\\resources\\sortedarrayinput.txt"));
            String line;
            BufferedWriter writer = new BufferedWriter(
                    new OutputStreamWriter(new FileOutputStream("D:\\KIT\\javacore\\src\\test\\resources\\sortedarrayoutput.txt")));
            while ((line = reader.readLine()) != null) {
                String[] splittedArray = line.split(",");
                Arrays.sort(splittedArray);

                 StringBuilder builder = new StringBuilder();
                for (int i = 0; i < splittedArray.length; i++) {
                    builder.append(splittedArray[i]);
                }
                writer.append(builder+"\n");
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

