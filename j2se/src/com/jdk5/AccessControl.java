package com.jdk5;

/**
 * Created by nzhmac on 15/1/14.
 */
public class AccessControl {
    public static boolean checkRight(AccessRight accessRight){
        if (accessRight == AccessRight.MANAGER){
            return true;
        }else if(accessRight == AccessRight.DEPARTMENT){
            return false;
        }
        return false;
    }

    public static void main(String[] args) {
        AccessRight accessRight = AccessRight.valueOf("MANAGER");
        System.out.println(checkRight(accessRight));
    }
}
