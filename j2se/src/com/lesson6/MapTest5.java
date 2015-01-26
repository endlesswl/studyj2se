package com.lesson6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by nzhmac on 15/1/12.
 */
public class MapTest5 {

    public static void main(String[] args){
        HashMap map = new HashMap();
        map.put("a", "aa");
        map.put("b", "bb");
        map.put("c", "cc");
        map.put("d", "dd");

        Set set = map.entrySet();


        for (Iterator it = set.iterator(); it.hasNext();){
            Map.Entry enter = (Map.Entry)it.next();
            String key = (String)enter.getKey();
            String value = (String)enter.getValue();
            System.out.println(key + " " + value);
        }


    }

}
