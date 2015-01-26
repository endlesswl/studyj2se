package com.lesson6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/**
 * Created by nzhmac on 15/1/9.
 */
public class MapTest3 {

    public static void main(String[] args){
        HashMap map = new HashMap();
        map.put("a", "aa");
        map.put("b", "bb");
        map.put("c", "cc");
        map.put("d", "dd");
        map.put("e", "ee");

        Set set = map.keySet();

        for (Iterator it = set.iterator(); it.hasNext();){
            String key = (String)it.next();
            String value = (String)map.get(key);

            System.out.println(key + " = " + value);
        }
    }

}
