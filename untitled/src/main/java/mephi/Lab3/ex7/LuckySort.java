package mephi.Lab3.ex7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LuckySort {
    public static void main(String[] args) {
        ArrayList strings = new ArrayList<String>();
        strings.add("Sheldon");
        strings.add("Penny");
        strings.add("Howard");
        strings.add("Raj");
        strings.add("Leonard");
        System.out.println(strings);
        Comparator<String> comp = new LengthComparator();
        luckySort(strings,comp);
        System.out.println(strings);


    }
    public static void luckySort(ArrayList<String> strings, Comparator <String> comp){
        boolean res = false;
        while (res == false) {
            for (int i = 0; i < strings.size() - 1; i++) {
                if ((comp.compare(strings.get(i), strings.get(i + 1))) < 0) {
                    Collections.shuffle(strings);
                    res = false;
                    break;
                }
                else res=true;
            }
        }
    }
}
