package com.util;

/**
 * Created by nzhmac on 15/1/4.
 */
public class MyRandomUtils {

    /**
     * 随机获取[0, bound]范围的int类型的数据。包含0 和 bound
     * @param bound
     * @return randomNumber
     * */
    public static int RandomInt(int bound){
        return (int)(Math.random() * (bound+1));
    }

    /**
     * 随机获取[start, end]范围数据。包含 start 和 end
     * @param start
     * @param end
     * @return randomNumber
     * */
    public static int RandomInt(int start, int end){
        return (int)(Math.random() * (end - start + 1) + start);
    }

    public static void main(String[] args){
        for (int i = 0; i < 20; i++)
        System.out.print(RandomInt(5, 10)+" ");
    }

}
