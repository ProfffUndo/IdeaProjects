package mephi.Lab3.ex9;

import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Tester {
    public static void main(String[] args) throws InterruptedException {
        Runnable run1 = () -> {
            System.out.println("Hello");
        };
        Runnable run2 = () -> {
            System.out.println("World!");
        };

        Runnable [] mas = {run1,run2};

        runTogether(run1);
        runTogether(run1,run2);
        runInOrder(run1);
        runInOrder(run1,run2);

    }

    public static void runTogether(Runnable... tasks) throws InterruptedException {
        ArrayList<Thread>  threads = new ArrayList<>(tasks.length);
        for (int i=0; i< tasks.length; i++)
        {
           threads.add(new Thread(tasks[i]));
        }
        for (int i=0; i< tasks.length; i++)
        {
            threads.get(i).start();
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException ex){
                ex.printStackTrace();
            }
        } /*Thread thread = new Thread(tasks[i]);
        thread.start();*/
    }

    public static void runInOrder(Runnable... tasks){
        for (int i=0; i< tasks.length; i++) {
            tasks[i].run();
        }
    }
}