package ru.edu.Document;

import java.time.LocalDate;

public abstract class Document implements Comparable<Document> {
    private int idOfDoc;
    private String nameOfDoc;
    private String textOfDoc;
    private int numOfDoc;
    private LocalDate dateOfDoc;
    private String authorOfDoc;
    private String name;

    @Override
    public String toString() {
        return "Документ [Идентификатор = " + idOfDoc
                + ", название = " + nameOfDoc
                + ", текст = " + textOfDoc
                + ", регистрационный номер " + numOfDoc
                + ", дата регистрации = " + dateOfDoc
                + ", автор = " + authorOfDoc + "]";
    }

    /**
     * Сравнение документов по автору и рег. номеру
     */
    public int compareTo(Document anotherDocument) {
        if (this.numOfDoc == anotherDocument.numOfDoc) {
            if (this.dateOfDoc.isEqual(anotherDocument.dateOfDoc)) {
                return 0;
            } else if (this.dateOfDoc.isAfter(anotherDocument.dateOfDoc)) {
                return 1;
            } else return -1;
        } else if (this.numOfDoc < anotherDocument.numOfDoc) {
            return -1;
        } else return 1;
    }

    public int getIdOfDoc() {

        return idOfDoc;
    }

    public String getNameOfDoc() {

        return nameOfDoc;
    }

    public LocalDate getDateOfDoc() {

        return dateOfDoc;
    }

    public String getAuthorOfDoc() {

        return authorOfDoc;
    }

    public int getNumOfDoc() {

        return numOfDoc;
    }

    public String getName() {

        return name;
    }

    public void setIdOfDoc(int idOfDoc) {

        this.idOfDoc = idOfDoc;
    }

    public void setNameOfDoc(String nameOfDoc) {

        this.nameOfDoc = nameOfDoc;
    }

    public void setTextOfDoc(String textOfDoc) {

        this.textOfDoc = textOfDoc;
    }

    public void setNumOfDoc(int numOfDoc) {

        this.numOfDoc = numOfDoc;
    }

    public void setDateOfDoc(LocalDate dateOfDoc) {

        this.dateOfDoc = dateOfDoc;
    }

    public void setAuthorOfDoc(String authorOfDoc) {

        this.authorOfDoc = authorOfDoc;
    }

    public void setName(String name) {

        this.name = name;
    }
}

