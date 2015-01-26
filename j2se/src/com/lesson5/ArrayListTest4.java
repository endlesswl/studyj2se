package com.lesson5;

import java.util.ArrayList;

/**
 * Created by nzhmac on 15/1/7.
 */
public class ArrayListTest4 {

    public static  void main(String[] args){
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Integer(3));
        arrayList.add(new Integer(5));
        arrayList.add(new Integer(2));
        arrayList.add(new Integer(4));
        arrayList.add(new Integer(6));

        Object[] a = arrayList.toArray();
        System.out.println(((Integer)a[0]).intValue());
        System.out.println((Integer)a[0]);
        System.out.println(a[0]);
        for (int i = 0; i < a.length; i++){

            System.out.println(a[i]);
        }
    }

}
