package com.lesson6;

import com.lesson5.StrackTest;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by nzhmac on 15/1/8.
 */
public class TreeSetTest2 {

    public static void main(String[] args){
        TreeSet set = new TreeSet();

        Person p1 = new Person(10);
        Person p2 = new Person(20);
        Person p5 = new Person(20);
        Person p3 = new Person(30);
        Person p4 = new Person(40);

        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);
        set.add(p5);

        for (Iterator it = set.iterator(); it.hasNext();){
            Person pp = (Person)it.next();
            System.out.println(pp.score);
        }
        System.out.println(set);
    }

}

class Person implements Comparable{
    int score;
    public Person(int score){
        this.score = score;
    }

    public String toString(){
        return String.valueOf(this.score);
    }

    @Override
    public int compareTo(Object o) {

        Person person = (Person)o;

        return person.score - this.score;
    }
}
