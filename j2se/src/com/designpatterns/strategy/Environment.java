package com.designpatterns.strategy;

import java.util.List;

/**
 * Created by nzhmac on 15/1/13.
 */
public class Environment {

    private SortInterface sortInterface;

    public Environment(SortInterface sortInterface) {
        this.sortInterface = sortInterface;
    }

    public void setSortInterface(SortInterface sortInterface) {
        this.sortInterface = sortInterface;
    }

    public void sort(List<Person> list){
        this.sortInterface.sort(list);
    }

    public Environment(){}
}
