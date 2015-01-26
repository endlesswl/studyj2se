package com.designpatterns.strategy;

import com.sun.xml.internal.rngom.digested.DOneOrMorePattern;

import java.util.ArrayList;

/**
 * Created by nzhmac on 15/1/13.
 */
public class Client {

    public static void main(String[] args) {

        Person p1 = new Person(1, "c", 2);
        Person p2 = new Person(2, "aa", 2);
        Person p3 = new Person(3, "aa", 2);
        Person p4 = new Person(4, "d", 2);
        Person p5 = new Person(5, "e", 2);

        ArrayList<Person> list = new ArrayList<Person>();

        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);

        Environment env = new Environment();
        UpNameSort uns = new UpNameSort();

        env.setSortInterface(uns);

        env.sort(list);

        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        System.out.println("===============");
        DownNameSort dns = new DownNameSort();
        env.setSortInterface(dns);
        env.sort(list);

        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
