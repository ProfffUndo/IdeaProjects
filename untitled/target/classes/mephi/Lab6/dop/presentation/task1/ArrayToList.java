package mephi.Lab6.dop.presentation.task1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayToList {
    public static <T> List<T> arrayToList(T[] array) {
        return Arrays.stream(array).collect(Collectors.toList());
    }

    public static List arrayOfStringsToList (String [] array){
            return Arrays.stream(array).collect(Collectors.toList());
    }

    public static List arrayOfIntegersToList (Integer [] array){
        return Arrays.stream(array).collect(Collectors.toList());
    }

    public static List arrayOfObjectsToList (Object [] array){
        return Arrays.stream(array).collect(Collectors.toList());
    }

}
