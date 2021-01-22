package mephi.Lab7.Ex14;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        ImmutableList immutableList = new ImmutableList(7);
        System.out.println(immutableList.get(5));

        for (Integer integer : immutableList) {
            System.out.println(integer);
        }
    }
}
