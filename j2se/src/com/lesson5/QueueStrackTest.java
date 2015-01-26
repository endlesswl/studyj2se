package com.lesson5;

import com.lesson6.QueueTest;

/**
 * Created by nzhmac on 15/1/8.
 */
public class QueueStrackTest {

    public static void main(String[] args){
        QueueTest queue = new QueueTest();
        queue.put("1");
        queue.put("2");
        queue.put("3");
        queue.put("4");
//        System.out.println("33");
//        System.out.println(queue.isEmpty());
        while (!queue.isEmpty()){
            System.out.println(queue.get());
        }
        System.out.println(queue.isEmpty());

        StrackTest strack = new StrackTest();
        strack.push("1");
        strack.push("2");
        strack.push("3");
        strack.push("4");

        while (!strack.isEmpty()){
            System.out.println("it is :"+strack.peek());
            System.out.println("get it :"+strack.pop());
        }
    }

}
