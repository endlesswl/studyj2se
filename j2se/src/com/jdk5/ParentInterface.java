package com.jdk5;

/**
 * Created by nzhmac on 15/1/13.
 */
public interface ParentInterface <T1, T2> {

    public void setFoo1(T1 foo1);
    public void setFoo2(T2 foo2);
    public T1 getFoo1();
    public T2 getFoo2();
}
