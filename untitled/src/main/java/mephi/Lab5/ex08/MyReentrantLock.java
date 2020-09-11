package mephi.Lab5.ex08;

import java.util.concurrent.locks.ReentrantLock;



public class MyReentrantLock extends ReentrantLock implements AutoCloseable{

    @Override
    public void close(){
        unlock();
    }
}



