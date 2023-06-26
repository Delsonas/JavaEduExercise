package ru.edu.Builder;

import ru.edu.Document.Document;
import ru.edu.Document.OutgoingDocument;

public class OutDocBuilder extends DocBuilder {
    public String adrOfOut;
    public String wayOfOut;

    public OutDocBuilder setAdrOfOut(String adrOfOut) {
        this.adrOfOut = adrOfOut;
        return this;
    }

    public OutDocBuilder setWayOfOut(String wayOfOut) {
        this.wayOfOut = wayOfOut;
        return this;
    }

    @Override
    public Document build() {
        Document doc = new OutgoingDocument();
        doc.setIdOfDoc(idOfDoc);
        doc.setNameOfDoc(nameOfDoc);
        doc.setTextOfDoc(textOfDoc);
        doc.setNumOfDoc(numOfDoc);
        doc.setDateOfDoc(dateOfDoc);
        doc.setAuthorOfDoc(authorOfDoc);
        return doc;
    }
}
