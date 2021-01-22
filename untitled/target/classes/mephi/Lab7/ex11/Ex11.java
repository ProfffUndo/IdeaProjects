package mephi.Lab7.ex11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex11 {
    public static void main(String[] args) {
        String sentence = "Sam likes to play football";
        List<String> words = new ArrayList<>(Arrays.asList(sentence.split(" ")));
        Collections.shuffle(words.subList(1,words.size()-1));
        System.out.println(words);
    }
}
