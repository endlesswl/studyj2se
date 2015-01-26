package com.lesson4;

/**
 * Created by nzhmac on 14/12/30.
 */
public class ArrayTest2 {

    public static void main(String[] args) {

        Person[] p = new Person[3];
        System.out.println(p[0]);

        p[0] = new Person(1);
        p[1] = new Person(20);
        p[2] = new Person(30);

        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i].age);
        }

        Person[] p2 = new Person[5];

        for (int i = 0; i < p2.length; i++) {
            System.out.println(p2[i]);
        }

    }

}

class Person {
    int age;

    public Person(int age) {
        this.age = age;
    }
}
