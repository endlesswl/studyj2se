package com.jdk5;

import com.lesson4.IntegerTest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by nzhmac on 15/1/13.
 */
public class Frequency {

    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (String arg : args){
            map.put(arg, (null == map.get(arg))? 1: map.get(arg)+1);
        }

        System.out.println(map);
//        for (Map.Entry<String, Integer> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + " " + entry.getValue() );
//        }
        
    }
    
}
