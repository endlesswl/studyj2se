package com.jdk5;

import java.util.EnumSet;
import java.util.Iterator;

/**
 * Created by nzhmac on 15/1/14.
 */
enum FontConstant{
    Plain, Bold, Italilc, Hello
}

public class EnumSetDemo {

    public static void main(String[] args) {
        EnumSet<FontConstant> enumSet = EnumSet.of(FontConstant.Plain, FontConstant.Bold);

        showEnumSet(enumSet);
        System.out.println("======");
        showEnumSet(EnumSet.complementOf(enumSet));
    }

    public static void showEnumSet(EnumSet<FontConstant> enumSet){
        for (Iterator<FontConstant> it = enumSet.iterator(); it.hasNext();){
            System.out.println(it.next());
        }
    }

}
