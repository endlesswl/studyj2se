package com.lesson6;

import java.util.HashMap;

/**
 * Created by nzhmac on 15/1/9.
 */
public class MapTest1 {

    public static void main(String[] args){
        HashMap map = new HashMap();
        map.put("a", "zhangsan");
        map.put("b", "wangwu");
        map.put("c", "lisi");
        map.put("a", "zhaoliu");

//        System.out.println(map);
        String value = (String)map.get("b");
        System.out.println(value);
        System.out.println("--------------------");

        String value2 = (String)map.get("d");
        System.out.println(value2);
    }

}
