package main.exceptions;

public class InvalidArgumentsException extends RuntimeException {

    public InvalidArgumentsException(String message) {
        super(message);
    }
}
