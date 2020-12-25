package mephi.Lab7.dop.RemoveEl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        List<Integer> arrayList = IntStream.range(0,100000).boxed().collect(Collectors.toList());
        LinkedList<Integer> linkedList = new LinkedList<Integer>(arrayList);
        Predicate<Integer> predicate1 = integer->integer%2==0;
        Predicate<Integer> predicate2 = integer -> integer>50000;
        Predicate<Integer> predicate3 = integer -> integer%10000==0;//Добавить ноль


       /* Iterator<Integer> iterator = arrayList.iterator();

        while(iterator.hasNext()) {
            Integer integer = iterator.next();
            if (predicate1.test(integer)) {
                iterator.remove();
            }
        }*/

        long startTime = System.currentTimeMillis();
       // arrayList.removeIf(predicate3); // 14 ms
        linkedList.removeIf(predicate2); //19 ms

        Iterator<Integer> iterator = arrayList.iterator();
        while(iterator.hasNext()) {
            Integer integer = iterator.next();
            if (predicate2.test(integer)) {
                iterator.remove();
            }
        }
      //  linkedList.removeIf(integer -> integer%2==0); //216 ms
      //  arrayList.removeIf(integer -> integer>5000000);//171 ms
      //  linkedList.removeIf(integer -> integer>5000000); //472 ms
        long endTime = System.currentTimeMillis();
        System.out.println("Total execution time: " + (endTime-startTime) + "ms");

    }

    public static <Integer> void removeWithRemoveIf(List<Integer> list, Predicate<Integer> predicate){
        list.removeIf(predicate);
    }
    public static <Integer> void removeWithIterator(List<Integer> list, Predicate<Integer> predicate) {
        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            Integer integer = iterator.next();
            if (predicate.test(integer)) {
                iterator.remove();
            }
        }
    }
}
