package com.jdk5;

/**
 * Created by nzhmac on 15/1/13.
 */
public class EunmTest {

    public static void doOP(OpConstant opConstant){
        switch (opConstant){
            case TURN_LEFT:
                System.out.println("向左转");
                break;
            case TURN_RIGHT:
                System.out.println("向右转");
                break;
            case SHOOT:
                System.out.println("射击");
                break;
        }
    }

    public static void main(String[] args) {
        doOP(OpConstant.SHOOT);
    }
}

enum OpConstant{
    TURN_LEFT, TURN_RIGHT, SHOOT
}
