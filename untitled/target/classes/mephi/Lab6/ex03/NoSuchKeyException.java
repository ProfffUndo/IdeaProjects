package mephi.Lab6.ex03;

public class NoSuchKeyException extends RuntimeException {
    public NoSuchKeyException(String message) { super(message); }
    public NoSuchKeyException(Throwable cause) { initCause(cause); }
    public NoSuchKeyException(String message, Throwable cause) {
        super(message) ;
        initCause(cause); }
}
