package com.lesson7;

import java.util.*;

/**
 * Created by nzhmac on 15/1/12.
 */
public class RandomTest {

    public static void main(String[] args) {
        Random random = new Random();

        Map map = new TreeMap();

        for (int i = 0 ; i < 50; i++){
            int num = random.nextInt(41) + 10;

            if (map.get(num) == null){
                map.put(num, 1);
            }else{
                int value = (Integer)map.get(num);
                map.put(num, new Integer(value+1));
            }

        }

        Collection collection = map.values();
        Integer maxOccurs = (Integer)Collections.max(collection);
        List list = new ArrayList();

        for (Iterator it = map.entrySet().iterator(); it.hasNext();){
            Map.Entry entry = (Map.Entry) it.next();
            Integer key = (Integer)entry.getKey();
            Integer value = (Integer)entry.getValue();

            if(maxOccurs.intValue() == value.intValue()){
                list.add(key);
            }
            System.out.println(entry.getKey() + "　" + entry.getValue());
        }

        System.out.println("======");
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i) + " " + map.get(list.get(i)));
        }

        System.out.println("出现的最多次数：" + maxOccurs);


    }

}
