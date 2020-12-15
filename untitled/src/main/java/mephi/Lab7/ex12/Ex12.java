package mephi.Lab7.ex12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex12 {
    public static void main(String[] args) {
        String sentence = "Sam likes to play football.";

        ArrayList<String> a = new ArrayList<>(Arrays.asList(sentence.split(" ")));
        a.set(0,a.get(0).toLowerCase());
        a.set(a.size()-1, a.get(a.size()-1).replace(".",""));
        Collections.shuffle(a.subList(1, a.size() - 1));

        int c = 0;

        for (String w : a) {
            if (c == a.size() - 1) {
                System.out.println(w);
            } else {
                System.out.print(w + " ");
            }
            c++;
        }
    }
}
