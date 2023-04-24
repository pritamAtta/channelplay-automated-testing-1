package com.test.channelplay.utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class GetProperty {

    private static final String ENVIRONMENT = "environment";
    private static String value = null;

    public static String value(String key) {
        Properties prop = new Properties();
        GetProperty gp = new GetProperty();
            try {
                FileReader reader=new FileReader("application.properties");
                prop.load(reader);
                value = prop.getProperty(gp.getValueForEnv(key));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }  catch (IOException e) {
                e.printStackTrace();
            }
            return value;
    }

    private String getValueForEnv(String key){
        String envValue = "";

        if(System.getProperty(ENVIRONMENT).equals("QA")){
            envValue = "QA." + key;
        }
        if(System.getProperty(ENVIRONMENT).equals("PreProd")){
            envValue = "PreProd" + key;
        }
        if(System.getProperty(ENVIRONMENT).equals("Prod")){
            envValue = "Prod." + key;
        }

        return envValue;
    }
}
