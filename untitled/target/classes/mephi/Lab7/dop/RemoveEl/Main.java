package mephi.Lab7.dop.RemoveEl;

import mephi.Lab4.Ex9.Ex9;

import java.util.*;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new Random().ints(100000, 0, 100000).boxed().collect(Collectors.toCollection(LinkedList::new));
        ArrayList<Integer> arrayList = new Random().ints(100000, 0, 100000).boxed().collect(Collectors.toCollection(ArrayList::new));
        BiPredicate<Integer,Integer> biPredicate1 = (integer,integer2) ->integer % 2 == 0 && integer2 % 10 == 0;

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
//        arrayList.removeIf(predicate1);
//        arrayList.removeIf(predicate1);
        //arrayList.removeIf(predicate1);
          biRemove(arrayList,biPredicate1);
   //     arrayList.removeIf(predicate1);
     //   biRemove(linkedList,biPredicate1);
        long endTime = System.currentTimeMillis();
        System.out.println("Total execution time: " + (endTime-startTime) + "ms");

    }

    public static <T> void biRemove(List<T> list, BiPredicate <T,Integer> predicate){
        if (list instanceof ArrayList){
            biRemoveArrayList(list,predicate);
        }
        else biRemoveLinked(list,predicate);
    }

    public static <T> void biRemoveLinked(List<T> list, BiPredicate <T,Integer> predicate) {
        Iterator<T> iterator = list.iterator();
        int current = 0;
        while (iterator.hasNext()) {
            if (predicate.test(iterator.next(),current)) {
                iterator.remove();
            }
            current++;
        }
    }

    public static <T> void biRemoveArray(List<T> list, BiPredicate<T,Integer> predicate) {
        //list.toArray()
        final Object[] es = list.toArray();
        int i = 0;
        int end = list.size();
        // Оптимизация для первоначального запуска
//        for (; i < end && !predicate.test((T) es[i], i); i++) ;

        if (i < end) {
            final int beg = i;
            final long[] deathRow = new long[(((end - beg) - 1) >> 6) + 1];
            deathRow[0] = 1L;   // set bit 0
            // Первый проход, чтобы найти элементы для удаления
            for (i = beg + 1; i < end; i++)
                if (predicate.test((T) es[i], i))
                    deathRow[i - beg >> 6] |= 1L << i - beg;
            int w = beg;
            // Второй проход, чтобы физически удалить
            for (i = beg; i < end; i++)
                if ((deathRow[i - beg >> 6] & (1L << i - beg)) == 0)
                    es[w++] = es[i];
                //Отброс хвоста
            shiftTailOverGap(es, list.size(), w,end);
          //  list= new ArrayList<>(w);
            // Очищение листа
            list.clear();
            //Добавление элементов
            for (int j=0; j<w;j++){
                list.add((T) es[j]);
            }
        }
    }

    public static<T> void biRemoveArrayList(List<T> list, BiPredicate<T,Integer> predicate) {
        Objects.requireNonNull(list);
        final Object[] es = list.toArray(); //O(n)
        ArrayList<T> buf = new ArrayList<>(list.size());

        int j=0,i=0; //Проход+добавление O(n)  i-проход, j-проход если элемент надо оставить
        for(;i<es.length;i++){
            if(!predicate.test((T) es[i],i)){
                {
                    buf.add((T)es[i]);
                }
                j++;
            }
        }
        list.clear();//O(n)
        list.addAll(buf); //O(n)
    }


    private static void shiftTailOverGap(Object[] es, int size, int lo, int hi) {
        System.arraycopy(es, hi, es, lo, size - hi);
        for (int to = size, i = (size -= hi - lo); i < to; i++)
            es[i] = null;
    }
}

//TODO: Независимо листа(Эрэй и Линкед) работало максимально оптимально
