package mephi.Lab4.Ex10;

import java.lang.reflect.Method;
import java.util.Arrays;

public class Ex10 {
    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,5,6,7,8,9,10 };
        Class<?> cl = arr.getClass();
        while(cl != null ) {

            for (Method m : cl.getDeclaredMethods()) {

                System.out.println(m.getReturnType().getCanonicalName()+" "+
                        m.getName()+
                        Arrays.toString(m.getParameters()));
            }

            cl=cl.getSuperclass();
        }
    }
}
