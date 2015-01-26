package com.designpatterns.strategy;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by nzhmac on 15/1/13.
 */
public class SortByAgeASC implements Sort {

    @Override
    public void sort(List<Person> list) {
        Collections.sort(list, new MyComparator());
    }

    class MyComparator implements Comparator<Person>{

        public int compare(Person p1, Person p2){
            return p1.getId() - p2.getId();
        }

    }
}


