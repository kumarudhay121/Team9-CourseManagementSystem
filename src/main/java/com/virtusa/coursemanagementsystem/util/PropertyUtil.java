package com.virtusa.coursemanagementsystem.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtil {
    public static Properties getProperty(){
        Properties pr = new Properties();
        try {
            pr.load(new FileInputStream("src/main/resources/application.properties"));
            return pr;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
