package com.designpatterns.dynamicproxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Vector;
import java.util.List;

/**
 * Created by nzhmac on 15/1/24.
 */
public class VectorProxy implements InvocationHandler {

    private Object proxyObj;

    public VectorProxy(Object proxyObj) {
        this.proxyObj = proxyObj;
    }

    public static Object factory(Object obj){
        Class<?> classType = obj.getClass();
        return Proxy.newProxyInstance(classType.getClassLoader(), classType.getInterfaces(), new VectorProxy(obj));
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before calling: " + method);

        if (null != args){
            for (Object arg : args) {
                System.out.println(arg);
            }
        }

        Object object = method.invoke(proxyObj, args);

        System.out.println("after calling: " + method);

        return object;
    }

    public static void main(String[] args) {
        List v = (List)factory(new Vector());
        System.out.println(v.getClass().getName());
        v.add("New");
        v.add("York");
        System.out.println(v);

        v.remove(0);
        System.out.println(v);
    }
}
