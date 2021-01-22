package mephi.Lab7;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list = new LinkedList<String>();

        list.add("123");
        list.add("456");
        list.add("789");

        Iterator<String> iterator = list.listIterator();

        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());

    }
}
