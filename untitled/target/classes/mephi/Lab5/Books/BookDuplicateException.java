package mephi.Lab5.Books;

public class BookDuplicateException extends Exception {
    public BookDuplicateException(String message) { super(message); }
    public BookDuplicateException(Throwable cause) { initCause(cause); }
    public BookDuplicateException(String message, Throwable cause) {
        super(message) ;
        initCause(cause); }
}
