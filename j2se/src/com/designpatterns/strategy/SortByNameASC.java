package com.designpatterns.strategy;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by nzhmac on 15/1/13.
 */
public class SortByNameASC implements Sort{

    @Override
    public void sort(List<Person> list) {
        Collections.sort(list, new MyComparator());
    }

    class MyComparator implements Comparator<Person>{
        @Override
        public int compare(Person o1, Person o2) {

            if (o1.getName().equals(o2.getName())){
                return o1.getId() - o2.getId();
            }
            return o1.getName().compareTo(o2.getName());
        }
    }

}
