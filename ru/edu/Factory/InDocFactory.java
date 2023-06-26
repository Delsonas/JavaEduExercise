package ru.edu.Factory;

import org.springframework.stereotype.Component;
import ru.edu.Builder.InDocBuilder;
import ru.edu.Document.Document;

@Component

public class InDocFactory extends DocFactory {

    @Override
    public Document crtDoc() {
        InDocBuilder inDocBuilder = new InDocBuilder();
        inDocBuilder.setAdrOfInc(generator.gnrRndMan(manHolder.getPeople()));
        inDocBuilder.setDateOfInc(generator.gnrRndDate());
        inDocBuilder.setNumbOfInc("fvd-1");
        inDocBuilder.setSendOfInc(generator.gnrRndMan(manHolder.getPeople()));
        this.setCommonDate(inDocBuilder);
        return inDocBuilder.build();
    }
}
