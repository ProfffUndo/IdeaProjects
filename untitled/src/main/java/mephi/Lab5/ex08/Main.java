package mephi.Lab5.ex08;

import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args){

        //try(ReentrantLock lock = new ReentrantLock()){} = compiler error

        try(AutoCloseable locker = lock();){

            //some work...

        } catch (Exception e) {
			/*must catch the exception since the static method 'lock'
			return an 'AutoCloseable' and not 'MyReentrantLock' object
			(AutoClosable is more general case and MyReentrantLock is
			 private case)
			*/
            e.printStackTrace();
        }

    }

    public static AutoCloseable lock() {

        MyReentrantLock locker = new MyReentrantLock();

        locker.lock();

        return locker;	//implements AutoCloseable
    }
}
