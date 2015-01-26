package com.reflect;

import java.lang.reflect.Method;

/**
 * Created by nzhmac on 15/1/16.
 */
public class InvokeTester {
    public int add(int param1, int param2){
        return param1 + param2;
    }

    public String echo(String message){
        return "Hello: " + message;
    }

    public static void main(String[] args) throws Exception{
//        InvokeTester test = new InvokeTester();
//        System.out.println(test.add(1, 2));
//        System.out.println(test.echo("tom"));
        Class<?> classType = InvokeTester.class;

        Method[] methods = classType.getDeclaredMethods();

        for (Method method : methods) {

            System.out.println(method);
        }

        Object invokeTester = classType.newInstance();

//        System.out.println(invokeTester instanceof InvokeTester);

        Method addMethod = classType.getMethod("add", new Class[]{int.class, int.class});

        Object result = addMethod.invoke(invokeTester, new Object[]{1, 2});
        Object result3 = addMethod.invoke(invokeTester, 1, 2);

        System.out.println((Integer)result3);

        System.out.println("--------------------");

        Method echoMethod = classType.getMethod("echo", new Class[]{String.class});

        Object result2 = echoMethod.invoke(invokeTester, new Object[]{"tom"});

        System.out.println(result2);

    }
}
