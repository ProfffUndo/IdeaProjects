package mephi.Lab5.ex08;

import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args){

      try(AutoCloseable locker = lock();){


        } catch (Exception e) {
			e.printStackTrace();
        }

    }

    public static AutoCloseable lock() {

        MyReentrantLock locker = new MyReentrantLock();

        locker.lock();

        return locker;
    }
}
