package ru.edu;

import java.time.LocalDate;

public class InDocBuilder extends DocBuilder {
    public String sendOfInc;
    public String adrOfInc;
    public String numbOfInc;
    public LocalDate dateOfInc;

    Document doc = new IncomingDocument();

    public InDocBuilder setSendOfInc(String sendOfInc) {
        this.sendOfInc = sendOfInc;
        return this;
    }

    public InDocBuilder setAdrOfInc(String adrOfInc) {
        this.adrOfInc = adrOfInc;
        return this;
    }

    public InDocBuilder setNumbOfInc(String numbOfInc) {
        this.numbOfInc = numbOfInc;
        return this;
    }

    public InDocBuilder setDateOfInc(LocalDate dateOfInc) {
        this.dateOfInc = dateOfInc;
        return this;
    }

    @Override
    public Document build() {
        doc.setIdOfDoc(idOfDoc);
        doc.setNameOfDoc(nameOfDoc);
        doc.setTextOfDoc(textOfDoc);
        doc.setNumOfDoc(numOfDoc);
        doc.setDateOfDoc(dateOfDoc);
        doc.setAuthorOfDoc(authorOfDoc);
        return doc;
    }
}
