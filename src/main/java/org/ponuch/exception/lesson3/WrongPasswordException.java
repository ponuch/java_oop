package org.ponuch.exception.lesson3;

public class WrongPasswordException extends RuntimeException{
    WrongPasswordException() {}

    WrongPasswordException(String message) {
        super(message);
    }
}
