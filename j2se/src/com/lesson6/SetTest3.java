package com.lesson6;

import com.lesson5.StrackTest;

import java.util.HashSet;

/**
 * Created by nzhmac on 15/1/8.
 */
public class SetTest3 {

    public static void main(String[] args){
        HashSet set = new HashSet();
        Student s1 = new Student("lisi");
        Student s2 = new Student("lisi");

        set.add(s1);
        set.add(s2);

        System.out.println(set);

    }

}

class Student{
    String name;
    public Student(String name){
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (name != null ? !name.equals(student.name) : student.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
//    public int hashCode(){
//        return this.name.hashCode();
//    }
//
//    public boolean equals(Object obj){
//        if(this == obj){
//            return true;
//        }
//        if(null != obj && obj instanceof Student){
//            Student student = (Student) obj;
//            if (name.equals(student.name)){
//                return true;
//            }
//        }
//        return false;
//    }
}
