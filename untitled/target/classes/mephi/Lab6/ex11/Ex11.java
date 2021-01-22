package mephi.Lab6.ex11;

import mephi.Lab6.ex07.Pair;

public class Ex11 {
    public static <E> Pair<E> minMax (Comparable<E>[] arr) {

        if(arr.length == 0)
            throw new RuntimeException("Array must contains at least 1 element!");

        Pair pair = new Pair<E>(min(arr),max(arr));

        return pair;

    }

    @SuppressWarnings("unchecked")
    public static <E> E min (Comparable<? super E>[] arr){

        E min= null;

        if(arr.length > 0)
            min = (E) arr[0];

        for (int i = 1; i < arr.length; i++) {

            if( (arr[i].compareTo((E) min)) < 0)
                min = (E) arr[i];
        }

        return min;
    }

    @SuppressWarnings("unchecked")
    public static <E> E max (Comparable<? super E>[] arr){

        E max= null;

        if(arr.length > 0)
            max = (E) arr[0];

        for (int i = 1; i < arr.length; i++) {

            if( (arr[i].compareTo((E) max)) > 0)
                max = (E) arr[i];
        }

        return max;
    }
}
