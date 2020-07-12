package mephi.Lab4.Ex12;

import mephi.Lab2.ex10.RandomNumbers;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        long start = System.currentTimeMillis();
        GetRandomNumbers get = new GetRandomNumbers();
        Class cl = get.getClass();
        System.out.println("No reflection");
        System.out.println(System.currentTimeMillis() - start);
        System.out.println();


        Field field = cl.getDeclaredField("arr");
        Method method = cl.getMethod("gettingRandomNumbers", null);
        start = System.currentTimeMillis();
        Object obj;
        method.invoke(get, null);
        System.out.println("Reflection");
        System.out.println(System.currentTimeMillis() - start);
    }

}
