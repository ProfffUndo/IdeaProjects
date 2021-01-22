package mephi.Lab5.Books;

public class NoSuchShelfException extends Exception {

    public NoSuchShelfException(String message) { super(message); }
    public NoSuchShelfException(Throwable cause) { initCause(cause); }
    public NoSuchShelfException(String message, Throwable cause) {
        super(message) ;
        initCause(cause); }
}
