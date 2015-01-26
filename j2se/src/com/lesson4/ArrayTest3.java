package com.lesson4;

/**
 * Created by nzhmac on 14/12/31.
 */
public class ArrayTest3 {

    public static void main(String[] args) {
        Student[] s = new Student[100];

        for (int i = 0; i < s.length; i++) {
            s[i] = new Student();

            s[i].name = i % 2 == 0 ? "zhangsan" : "lisi";

            /*if(i % 2 == 0){
                s[i].name = "zhangsan";
            }else{
                s[i].name = "lisi";
            }*/
        }

        for (int i = 1; i < s.length; i++) {
            System.out.println(s[i].name);
        }
    }

}

class Student {
    String name;
}
