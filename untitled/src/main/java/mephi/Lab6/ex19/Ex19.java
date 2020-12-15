package mephi.Lab6.ex19;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Ex19 {
    public static <T> T[] repeat(int n, T obj) {
        ArrayList<T> result = new ArrayList<>();
        for (int i = 0; i < n; i++) result.add(obj);
        return result.toArray((T[]) Array.newInstance(obj.getClass(), n));
    }

    public static void main(String[] args) {
        Double[] arrDouble = repeat(5,(7.3));
        System.out.println("arrDouble="+ Arrays.toString(arrDouble));
    }
}
