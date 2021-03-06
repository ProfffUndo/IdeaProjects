package mephi.Lab7.ex3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ex3 {
    public static <T> Set<T> union(Set<T> s1, Set<T> s2) {
        s1.addAll(s2);
        return s1;
    }

    public static <T> Set<T> intersection(Set<T> s1, Set<T> s2) {
        s1.retainAll(s2);
        return s1;
    }

    public static <T> Set<T> difference(Set<T> s1, Set<T> s2) {
        s1.removeAll(s2);
        return s1;
    }

    public static void main(String[] args) {

        Set<Integer> s1;
        Set<Integer> s2;

        s1 = new HashSet<>(Arrays.asList(1,2,3,4,5));
        s2 = new HashSet<>(Arrays.asList(4,5,6,7,8));

        System.out.println(union(s1,s2));
        // [1, 2, 3, 4, 5, 6, 7, 8]

        s1 = new HashSet<>(Arrays.asList(1,2,3,4,5));

        System.out.println(intersection(s1,s2));
        // [4, 5]

        s1 = new HashSet<>(Arrays.asList(1,2,3,4,5));

        System.out.println(difference(s1,s2));
        // [1, 2, 3]

    }
}
