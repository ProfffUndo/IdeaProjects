package mephi.Lab7.ex4;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ex4 {
    public static <T> void removeElements(List<T> a) {
        for (T t : a) {
            a.remove(t);
        }
    }

    public static <T> void concurrentRemoveElements(ConcurrentLinkedDeque<T> a) {
        while (true) {
            T e = a.poll();
            if (e == null) {
                break;
            } else System.out.println(Thread.currentThread().getName()+": "+e);
        }
    }

    public static void main(String[] args) {

        // Небезопасно удалять элементы из не синхронизированных коллекций
        List<Integer> a = IntStream.range(0, 10000).boxed().collect(Collectors.toList());
        Runnable r1 = () -> removeElements(a);
        Runnable r2 = () -> removeElements(a);
        new Thread(r1).start();
        new Thread(r2).start();


        //Используем синхронизированные аналоги коллекций из Concurrent пакета
        ConcurrentLinkedDeque<Integer> cld = new ConcurrentLinkedDeque<>(
                IntStream.range(0, 100).boxed().collect(Collectors.toList()));
        System.out.println("\ncld.size = " + cld.size() + "\n");

        Runnable r3 = () -> concurrentRemoveElements(cld);
        Thread t1 = new Thread(r3);
        Thread t2 = new Thread(r3);

        t1.start();
        t2.start();

        try {
            t1.join(); //Этот метод приостановит выполнение текущего потока до тех пор,
            // пока другой поток не закончит свое выполнение.
            // Если поток прерывается, бросается InterruptedException.
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\ncld.size = " + cld.size());
    }
    }

    //TODO:: Решить без многопоточки
