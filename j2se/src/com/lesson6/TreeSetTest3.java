package com.lesson6;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by nzhmac on 15/1/8.
 */
public class TreeSetTest3 {

    public static void main(String[] args){
        TreeSet set = new TreeSet(new MyComparator());

        set.add("C");
        set.add("A");
        set.add("D");
        set.add("a");
        set.add("F");
        set.add("D");

        for(Iterator it = set.iterator(); it.hasNext();){
            String value = (String)it.next();
            System.out.println(value);
        }

        System.out.println("A".hashCode());
    }

}

class MyComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        String s1 = (String)o1;
        String s2 = (String)o2;

        return s2.compareTo(s1);
    }
}
