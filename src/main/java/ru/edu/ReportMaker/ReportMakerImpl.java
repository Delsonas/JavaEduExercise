package ru.edu.ReportMaker;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import ru.edu.Document.Document;

import java.util.*;

/**
 * Сортировка мапы из автор документа:список документов, затем вывод отчёта на основе этой мапы
 */
@Service
public class ReportMakerImpl implements ReportMaker {
    private static final Logger LOGGER = LoggerFactory.getLogger(ReportMakerImpl.class);
    @Override
    public Map<String, List<Document>> sortAndGroup(List<Document> listOfDocs) {
        Collections.sort(listOfDocs);
        Map<String, List<Document>> mapOfDocs = new HashMap<>();
        for (Document doc : listOfDocs) {
            mapOfDocs.putIfAbsent(doc.getAuthorOfDoc(), new ArrayList<>());
            mapOfDocs.get(doc.getAuthorOfDoc()).add(doc);
        }
        return mapOfDocs;
    }

    @Override
    public void makeRep(Map<String, List<Document>> mapOfDocs) {
        for (String key : mapOfDocs.keySet()) {
            LOGGER.info(key);
            for (Document val : mapOfDocs.get(key))
                LOGGER.info("\t" + val.getName() + " №" +
                        val.getNumOfDoc() + " от " +
                        val.getDateOfDoc() + " " +
                        val.getNameOfDoc());
        }
    }
}
