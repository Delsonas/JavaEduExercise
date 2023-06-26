package ru.edu.ReportMaker;

import ru.edu.Document.Document;

import java.util.List;
import java.util.Map;

public interface ReportMaker {
    Map<String, List<Document>> sortAndGroup(List<Document> listOfDocs);

    void makeRep(Map<String, List<Document>> mapOfDocs);
}
