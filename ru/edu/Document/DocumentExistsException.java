package ru.edu.Document;

public class DocumentExistsException extends RuntimeException {
    public DocumentExistsException(String message) {
        super(message);
    }
}
