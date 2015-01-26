package com.lesson6;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by nzhmac on 15/1/9.
 */
public class CollectionsTest {

    public static void main(String[] args){
        LinkedList list = new LinkedList();

        list.add(new Integer(-8));
        list.add(new Integer(20));
        list.add(new Integer(-20));
        list.add(new Integer(8));


        Comparator r = Collections.reverseOrder();
        Collections.sort(list, r);

        for (Iterator it = list.iterator(); it.hasNext();){
            System.out.println(it.next());
        }


        System.out.println("=======================");

        Collections.shuffle(list);
        for (Iterator it = list.iterator(); it.hasNext();){
            System.out.println(it.next());
        }

        System.out.println("minimum value : " + Collections.min(list));
        System.out.println("minimum value : " + Collections.max(list));
    }

}
