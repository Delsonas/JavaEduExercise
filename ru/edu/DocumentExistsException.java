package ru.edu;

public class DocumentExistsException extends RuntimeException {
    public DocumentExistsException(String message) {
        super(message);
    }
}