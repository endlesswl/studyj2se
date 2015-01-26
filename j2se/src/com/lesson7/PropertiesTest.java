package com.lesson7;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

/**
 * Created by nzhmac on 15/1/13.
 */
public class PropertiesTest {

    public static void main(String[] args) {
        Properties properties = System.getProperties();

        Set set = properties.keySet();

        for (Iterator it = set.iterator(); it.hasNext();){
            String key = (String)it.next();
            String value = properties.getProperty(key);
            System.out.println(key +"="+value);
        }
    }

}
