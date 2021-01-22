package mephi.Lab7.ex6;

import java.util.*;

public class Ex6 {
    public static void main(String[] args) {

        // Способ инициализаци  Map<String, Set<Integer»,
        Map<String, Set<Integer>> ms = new HashMap<>();
        Set<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> s2 = new HashSet<>(Arrays.asList(4, 5, 6));
        Set<Integer> s3 = new HashSet<>(Arrays.asList(7, 8, 9));
        ms.put("one", s1);
        ms.put("two", s2);
        ms.put("three", s3);
        System.out.println(ms);
    }
}
