package ru.edu.Factory;

import org.springframework.stereotype.Component;
import ru.edu.Builder.TaskDocBuilder;
import ru.edu.Document.Document;

@Component

public class TaskDocFactory extends DocFactory {

    @Override
    public Document crtDoc() {
        TaskDocBuilder taskDocBuilder = new TaskDocBuilder();
        taskDocBuilder.setDateOfTask(generator.gnrRndDate());
        taskDocBuilder.setTermOfTask(generator.gnrRndDate());
        taskDocBuilder.setRespOfTask(generator.gnrRndMan(manHolder.getPeople()));
        taskDocBuilder.setSignOfTask("да");
        taskDocBuilder.setCtrlOfTask(generator.gnrRndMan(manHolder.getPeople()));
        this.setCommonDate(taskDocBuilder);
        return taskDocBuilder.build();
    }
}
