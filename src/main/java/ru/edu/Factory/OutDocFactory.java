package ru.edu.Factory;

import org.springframework.stereotype.Component;
import ru.edu.Builder.OutDocBuilder;
import ru.edu.Document.Document;

@Component

public class OutDocFactory extends DocFactory {

    @Override
    public Document crtDoc() {
        OutDocBuilder outDocBuilder = new OutDocBuilder();
        outDocBuilder.setAdrOfOut(generator.gnrRndMan(manHolder.getPeople()));
        outDocBuilder.setWayOfOut("машина");
        this.setCommonDate(outDocBuilder);
        return outDocBuilder.build();
    }
}
