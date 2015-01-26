package com.lesson5;

import java.util.ArrayList;

/**
 * Created by nzhmac on 15/1/7.
 */
public class ArrayListTest1 {
    public static void main(String[] args){
        ArrayList arrayList = new ArrayList();
        arrayList.add("hello");
        arrayList.add("world");
        arrayList.add("world");
        arrayList.add("welcome");
        arrayList.add("welcome");
        arrayList.add("welcome");

        String s1 = (String)arrayList.get(0);
        String s2 = (String)arrayList.get(1);
        String s3 = (String)arrayList.get(2);
        String s4 = (String)arrayList.get(3);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

        System.out.println("-----------------");

        for (int i=0; i<arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }

        arrayList.remove(0);
        arrayList.remove("welcome");
        System.out.println("-----------------");

        for (int i=0; i<arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }

        System.out.println("-----------------");
        System.out.println(arrayList.indexOf("bbb"));
        arrayList.indexOf("bbb");


//        int newCapacity = oldCapacity + (oldCapacity >> 1);
        System.out.println(10 >> 1);

    }
}
