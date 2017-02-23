package com.irenezar.app.classwork;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by new_user on 2/20/2017.
 */
public class ReadFileWithThrowsException {
    public static String readTheFile(String path)
        throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader(path));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
        return (line);
    }
}
