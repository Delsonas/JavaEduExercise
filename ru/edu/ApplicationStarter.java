package ru.edu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import ru.edu.DocManager.DocManagerImpl;
import ru.edu.ReportMaker.ReportMaker;
import ru.edu.Document.Document;

import java.util.List;
import java.util.Map;

@Component
public class ApplicationStarter implements ApplicationRunner {

    @Autowired
    private DocManagerImpl docManager;
    @Autowired
    private ReportMaker reportMaker;
    @Value("${DOCUMENTS_COUNT:15}")
    private int documentsCount;


    @Override
    public void run(ApplicationArguments args) {
        Map<String, List<Document>> sortedDocsOfAuthor = reportMaker.sortAndGroup(docManager.createDocs(documentsCount));
        reportMaker.makeRep(sortedDocsOfAuthor);
    }
}
