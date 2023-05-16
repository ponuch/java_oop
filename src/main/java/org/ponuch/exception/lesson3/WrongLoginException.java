package org.ponuch.exception.lesson3;

public class WrongLoginException extends RuntimeException{

    WrongLoginException() {}

    WrongLoginException(String message) {
        super(message);
    }
}
