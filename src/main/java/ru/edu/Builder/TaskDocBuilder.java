package ru.edu.Builder;

import ru.edu.Document.Document;
import ru.edu.Document.TaskDocument;

import java.time.LocalDate;

public class TaskDocBuilder extends DocBuilder {
    public LocalDate dateOfTask;
    public LocalDate termOfTask;
    public String respOfTask;
    public String signOfTask;
    public String ctrlOfTask;

    public TaskDocBuilder setDateOfTask(LocalDate dateOfTask) {
        this.dateOfTask = dateOfTask;
        return this;
    }

    public TaskDocBuilder setTermOfTask(LocalDate termOfTask) {
        this.termOfTask = termOfTask;
        return this;
    }

    public TaskDocBuilder setRespOfTask(String respOfTask) {
        this.respOfTask = respOfTask;
        return this;
    }

    public TaskDocBuilder setSignOfTask(String signOfTask) {
        this.signOfTask = signOfTask;
        return this;
    }

    public TaskDocBuilder setCtrlOfTask(String ctrlOfTask) {
        this.ctrlOfTask = ctrlOfTask;
        return this;
    }

    @Override
    public Document build() {
        Document doc = new TaskDocument();
        doc.setIdOfDoc(idOfDoc);
        doc.setNameOfDoc(nameOfDoc);
        doc.setTextOfDoc(textOfDoc);
        doc.setNumOfDoc(numOfDoc);
        doc.setDateOfDoc(dateOfDoc);
        doc.setAuthorOfDoc(authorOfDoc);
        return doc;
    }
}
