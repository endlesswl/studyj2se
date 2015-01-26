package com.lesson6;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by nzhmac on 15/1/8.
 */
public class InteratorTest {

    public static void main(String[] args){
        HashSet set = new HashSet();

        set.add("a");
        set.add("c");
        set.add("d");
        set.add("f");
        set.add("e");

        Iterator iterator = set.iterator();

        while (iterator.hasNext()){
            String value = (String) iterator.next();
            System.out.println(value);
        }

        for (Iterator it = set.iterator(); it.hasNext();){
            String value = (String)it.next();
            System.out.println(value);
        }

        System.out.println(set);
    }

}
