package mephi.Lab6.ex21;

import java.util.Arrays;
import java.util.List;

public class Ex21 {
    @SafeVarargs
      public static <T> T[] construct(int n, T...t) {
       return Arrays.copyOf(t, n);
      }

    public static void main(String[] args) {
        Integer[] ia7 = construct(5);
        System.out.println(ia7.length); //5
        System.out.println(ia7.getClass().getComponentType().getName()); //java.lang.Integer

        Boolean[] ba7 = construct(7);
        System.out.println(ba7.length); //7
        System.out.println(ba7.getClass().getComponentType().getName()); //java.lang.Boolean

        List<String>[] lsa7 = construct(9);
        System.out.println(lsa7.length); //9
        System.out.println(lsa7.getClass().getComponentType().getName()); //java.util.List
    }

}
