package mephi.Lab6.ex03;

public class KeyAlreadyExistsException extends RuntimeException {
    public KeyAlreadyExistsException(String message) { super(message); }
    public KeyAlreadyExistsException(Throwable cause) { initCause(cause); }
    public KeyAlreadyExistsException(String message, Throwable cause) {
        super(message) ;
        initCause(cause); }
}
