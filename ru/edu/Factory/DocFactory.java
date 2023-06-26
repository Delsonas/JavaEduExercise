package ru.edu.Factory;

import org.springframework.beans.factory.annotation.Autowired;
import ru.edu.MenHolder.MenHolder;
import ru.edu.RandomGenerator.RandomGenerator;
import ru.edu.Builder.DocBuilder;
import ru.edu.Document.Document;

public abstract class DocFactory {

    @Autowired
    protected MenHolder manHolder;
    @Autowired
    protected RandomGenerator generator;

    public void setCommonDate(DocBuilder builder){
        builder.setAuthorOfDoc(generator.gnrRndMan(manHolder.getPeople()));
        builder.setIdOfDoc(generator.gnrId());
        builder.setNameOfDoc(generator.gnrName());
        builder.setNumOfDoc(generator.gnrRegNum());
        builder.setTextOfDoc(generator.gnrText());
        builder.setDateOfDoc(generator.gnrRndDate());
    }
    public abstract Document crtDoc();
}
