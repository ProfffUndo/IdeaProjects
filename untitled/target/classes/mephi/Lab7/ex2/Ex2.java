package mephi.Lab7.ex2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class Ex2 {
    public static void main(String[] args) {

        ArrayList<String> a;

        // Используем итератор
        a = new ArrayList<>(Arrays.asList("one", "two", "three"));
          Iterator<String> it = a.iterator();
        int c = 0;
        while (it.hasNext()) {
            a.set(c, it.next().toUpperCase()); //O(n)
            c++;
        }
        System.out.println(a);
         for (ListIterator<String> iter = a.listIterator(); iter.hasNext(); ) {
                String next = iter.next().toUpperCase();
                iter.set(next);
            }

        System.out.println(a);

        // Используем перебор индексных значений в строке
        a = new ArrayList<>(Arrays.asList("one", "two", "three"));
        for (int i = 0; i < a.size(); i++)
            a.set(i, a.get(i).toUpperCase());
        System.out.println(a);



        // используем replaceAll()
        a = new ArrayList<>(Arrays.asList("one", "two", "three"));
        a.replaceAll(String::toUpperCase);
        System.out.println(a);






    }
}
