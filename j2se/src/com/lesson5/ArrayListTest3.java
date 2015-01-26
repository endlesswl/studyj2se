package com.lesson5;

import java.util.ArrayList;

/**
 * Created by nzhmac on 15/1/7.
 */
public class ArrayListTest3 {
    public  static void main(String[] args){
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Integer(1));
        arrayList.add(new Integer(2));
        arrayList.add(new Integer(3));
        arrayList.add(new Integer(5));
        arrayList.add(new Integer(6));

        int sum = 0;
        for (int i = 0; i < arrayList.size(); i++){
            Integer j = (Integer)arrayList.get(i);
            sum += j;
        }
        System.out.println(sum);
    }
}
