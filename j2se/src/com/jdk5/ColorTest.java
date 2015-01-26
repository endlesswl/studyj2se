package com.jdk5;

/**
 * Created by nzhmac on 15/1/13.
 */
public class ColorTest {
    public static void main(String[] args) {
        Color myColor = Color.Blue;
        System.out.println(myColor);
        System.out.println("=-=-=-=-=-=-=");

        for (Color color : Color.values()) {
            System.out.println(color);
        }

    }
}
