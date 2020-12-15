package mephi.Lab7.ex13;

public class CacheIsFullException extends RuntimeException {
    CacheIsFullException(String message){
        super(message);
    }

    CacheIsFullException(){

    }
}
