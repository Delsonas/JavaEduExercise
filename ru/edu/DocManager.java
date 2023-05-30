package ru.edu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DocManager {

    public List<Document> listOfDocs = new ArrayList<>();
    @Autowired
    private Factory docCreator;
    @Autowired
    StorageOfRegNum regNum;

    public List<Document> createDocs(int count) {
        int a;
        for (int i = count; i > 0; i--) {
            Document doc = this.docCreator.crtDoc(TypeOfDoc.rndType());
            a = doc.getNumOfDoc();
            regNum.adding(a);
            listOfDocs.add(doc);
        }
        return listOfDocs;
    }
}

