package ru.edu.DocManager;

import ru.edu.Document.Document;

import java.util.List;

public interface DocManager {
    List<Document> createDocs(int count);
}
