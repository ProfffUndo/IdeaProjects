package mephi.Lab3.ex8;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Tester {
    public static void main(String[] args) {
        Runnable runner1 = new Greeter(5, "Alex!");
        Runnable runner2 = new Greeter(5, "Gregory!");
        Thread thread1 = new Thread(runner1);
        Thread thread2 = new Thread(runner2);
        thread1.start();
        thread2.start();

    }
}
