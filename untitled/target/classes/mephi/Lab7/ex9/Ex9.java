package mephi.Lab7.ex9;

import java.util.HashMap;
import java.util.Map;

public class Ex9 {

    public static void main(String[] args) {
        String words = "one two three one two one four five four three one five";
        Map<String, Integer> counts = new HashMap<>();
        printWithContains(words,counts);
        printWithGetOrDefault(words,counts);
        printWithNullCheck(words,counts);
        printWithPutIfAbsent(words,counts);

    }

    public static void printMap(Map<String,Integer> map) {
        map.forEach((k,v) -> System.out.println(k + ": " + v));
    }

    public static void printWithContains(String words, Map<String, Integer> counts){
        System.out.println("printWithContains");
        for (String word: words.split(" ")) {
            if (counts.containsKey(word)) {
                int count = counts.get(word);
                counts.put(word, ++count);
            } else {
                counts.put(word, 1);
            }
        }
        printMap(counts);
        counts.clear();
    }

    public static void printWithNullCheck(String words, Map<String, Integer> counts){
        System.out.println("printWithNullCheck");
        for (String word: words.split(" ")) {
            if (counts.get(word) == null) {
                counts.put(word, 1);
            } else {
                int count = counts.get(word);
                counts.put(word, ++count);
            }
        }
        printMap(counts);

        counts.clear();
    }

    public static void printWithGetOrDefault(String words, Map<String, Integer> counts){
        System.out.println("printWithGetOrDefault");
        for (String word: words.split(" ")) {
            int count = counts.getOrDefault(word, 0);
            counts.put(word, ++count);
        }

        printMap(counts);

        counts.clear();
    }

    public static void printWithPutIfAbsent(String words, Map<String, Integer> counts){
        System.out.println("printWithPutIfAbsent");
        for (String word: words.split(" ")) {
            counts.putIfAbsent(word, 0);
            int count = counts.get(word);
            counts.put(word, ++count);
        }

        printMap(counts);
        counts.clear();
    }
}
