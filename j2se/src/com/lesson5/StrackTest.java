package com.lesson5;

import java.util.LinkedList;

/**
 * Created by nzhmac on 15/1/8.
 */
public class StrackTest {

    LinkedList strack = new LinkedList();

    public void push(Object o){
        strack.push(o);
    }

    public Object pop(){
        return strack.pop();
    }

    public Object peek(){
        return strack.peek();
    }

    public boolean isEmpty(){
        return strack.isEmpty();
    }
}
