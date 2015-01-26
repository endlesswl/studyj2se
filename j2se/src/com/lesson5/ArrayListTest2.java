package com.lesson5;

import java.util.ArrayList;

/**
 * Created by nzhmac on 15/1/7.
 */
public class ArrayListTest2 {
    public static void main(String[] args){
        ArrayList arrayList = new ArrayList();
        arrayList.add("hello");
        arrayList.add(new Integer(2));

        String s = (String)arrayList.get(0);
        Integer w = (Integer)arrayList.get(1);

        System.out.println(s);
        System.out.println(w.intValue());
    }
}
