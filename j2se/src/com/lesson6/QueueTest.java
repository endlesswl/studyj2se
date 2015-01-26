package com.lesson6;

import java.util.LinkedList;

/**
 * Created by nzhmac on 15/1/7.
 */
public class QueueTest {

    private LinkedList queue = new LinkedList();

    public void put(Object o){
        queue.addLast(o);
//        queue.add(o);
    }

    public Object get(){
//        Object o = queue.getFirst();
//        queue.removeFirst();
        return queue.removeFirst();
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }
}
