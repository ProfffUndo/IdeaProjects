package mephi.Lab7.ex4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ex4New {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        remove2(a,1);

        
    }
    public static <E> void remove1(List<E> list, E el) {
        for (E e : list) {
            if (e.equals(el)) {
                list.remove(e);
            }
        }
    }

    public static <E> void remove2(List<E> list, E el) {
        for (Iterator<E> iterator = list.listIterator(); iterator.hasNext(); ) {
            E e = iterator.next();
            if (e.equals(el)) {
                iterator.remove();
            }
        }
    }

    public static <E> void remove3(List<E> list, E el) {
        list.remove(el);
    }

    public static <E> void remove4(List<E> list, E el) {
        list.removeIf(e -> e.equals(el));
    }
}
