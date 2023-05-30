package ru.edu;

import org.springframework.stereotype.Component;

import java.util.*;
import java.lang.System;

@Component
public class ReportMaker {
    public Map<String, List<Document>> sorting(List<Document> listOfDocs) {
        Collections.sort(listOfDocs);
        Map<String, List<Document>> mapOfDocs = new HashMap<>();
        for (Document doc : listOfDocs) {
            mapOfDocs.putIfAbsent(doc.getAuthorOfDoc(), new ArrayList<>());
            mapOfDocs.get(doc.getAuthorOfDoc()).add(doc);
        }
        return mapOfDocs;
    }

    public void makeRep(Map<String, List<Document>> mapOfDocs) {
        for (String key : mapOfDocs.keySet()) {
            System.out.println(key);
            for (Document val : mapOfDocs.get(key))
                System.out.println("\t" + val.getName() + " №" +
                        val.getNumOfDoc() + " от " +
                        val.getDateOfDoc() + " " +
                        val.getNameOfDoc());
        }
    }
}
