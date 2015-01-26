package com.jdk5;

import java.awt.*;
import java.util.EnumSet;

/**
 * Created by nzhmac on 15/1/14.
 */
public class EnumSetDemo2 {

    public static void main(String[] args) {
        EnumSet<FontConstant> enumSet = EnumSet.noneOf(FontConstant.class);
        enumSet.add(FontConstant.Plain);
        enumSet.add(FontConstant.Bold);
        enumSet.add(FontConstant.Plain);
        showEnumSet(enumSet);
    }

    public static void showEnumSet(EnumSet<FontConstant> enumSet){
        for (FontConstant fontConstant : enumSet) {
            System.out.println(fontConstant);
        }
    }

}
