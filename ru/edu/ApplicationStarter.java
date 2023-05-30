package ru.edu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class ApplicationStarter implements ApplicationRunner {

    @Autowired
    DocManager docManager;
    @Autowired
    ReportMaker reportMaker;

    @Override
    public void run(ApplicationArguments args) {
        Map<String, List<Document>> sortedDocsOfAuthor = reportMaker.sorting(docManager.createDocs(10));
        reportMaker.makeRep(sortedDocsOfAuthor);
    }
}
