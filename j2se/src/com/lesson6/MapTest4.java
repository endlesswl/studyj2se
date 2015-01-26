package com.lesson6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by nzhmac on 15/1/9.
 */
public class MapTest4 {

    public static void main(String[] args){
//        System.out.println(args.length);
        HashMap map = new HashMap();
        for (int i=0; i < args.length; i++){
            if(map.get(args[i]) != null){
                Integer num = (Integer)map.get(args[i]);
                map.put(args[i], new Integer(++num));
            }else{
                map.put(args[i], new Integer(1));
            }
        }

        Set set = map.keySet();
        for (Iterator it = set.iterator(); it.hasNext();){
            String key = (String)it.next();
            Integer value = (Integer)map.get(key);
            System.out.println(key + "=" + value);
        }

    }

}
