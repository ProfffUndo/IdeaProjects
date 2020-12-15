package mephi.Lab5.Books;

public class NoSuchBookException extends  Exception {
    public NoSuchBookException(String message) { super(message); }
    public NoSuchBookException(Throwable cause) { initCause(cause); }
    public NoSuchBookException(String message, Throwable cause) {
        super(message) ;
        initCause(cause); }
}
