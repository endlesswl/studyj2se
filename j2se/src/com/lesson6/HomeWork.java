package com.lesson6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

/**
 * Created by nzhmac on 15/1/12.
 */
public class HomeWork {

    public static void main(String[] args) {

        HashMap map = new HashMap();

        for (int i=0; i<50; i++){
            int rnum = (new Random().nextInt(41)+10);
            if (map.get(new Integer(rnum)) != null){
                map.put(rnum, ((Integer)map.get(rnum))+1);
            } else {
                map.put(rnum, new Integer(1));
            }
        }

        String best;
        int num = 0;
        for (Iterator it = map.entrySet().iterator(); it.hasNext();){
            Map.Entry entry = (Map.Entry) it.next();
            if((Integer)entry.getValue() > num){

            }
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }

}
