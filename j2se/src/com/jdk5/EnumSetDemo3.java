package com.jdk5;


import java.util.List;
import java.util.ArrayList;
import java.util.EnumSet;

/**
 * Created by nzhmac on 15/1/14.
 */
public class EnumSetDemo3 {

    public static void main(String[] args) {
        List<FontConstant> list = new ArrayList<FontConstant>();
        list.add(FontConstant.Bold);
        list.add(FontConstant.Italilc);
        list.add(FontConstant.Plain);

        showEnumSet(EnumSet.copyOf(list));
    }

    public static void showEnumSet(EnumSet<FontConstant> enumSet){
        for (FontConstant fontConstant : enumSet) {
            System.out.println(fontConstant);
        }
    }
}
