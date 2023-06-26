package ru.edu.DocManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.edu.StorageOfRegNum.StorageOfRegNum;
import ru.edu.Document.Document;
import ru.edu.Document.TypeOfDoc;
import ru.edu.Factory.DocFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Получаем нужное количество документов, добавляем их в список, а рег. номера документов добавляем в хэш-таблицу
 */
@Service
public class DocManagerImpl implements DocManager {



    @Autowired
    private Map<String, DocFactory> docFactoryMap;
    @Autowired
    private StorageOfRegNum storageOfRegNum;

    /**
     * @param count количество документов
     * @return список документов
     */
    @Override
    public List<Document> createDocs(int count) {
        List<Document> listOfDocs = new ArrayList<>();
        for (int i = count; i > 0; i--) {

            Document doc;
            DocFactory docFactory;
            switch (TypeOfDoc.rndType()) {
                case TASK_DOCUMENT:
                    //docFactory = new TaskDocFactory();
                    docFactory = docFactoryMap.get("taskDocFactory");
                    break;

                case INCOMING_DOCUMENT:
                    //docFactory = new InDocFactory();
                    docFactory = docFactoryMap.get("inDocFactory");
                    break;

                case OUTGOING_DOCUMENT:
                    //docFactory = new OutDocFactory();
                    docFactory = docFactoryMap.get("outDocFactory");
                    break;

                default:
                    throw new RuntimeException("Нет такого типа документа");
            }
            doc = docFactory.crtDoc();
            storageOfRegNum.adding(doc.getNumOfDoc());
            listOfDocs.add(doc);
        }
        return listOfDocs;
    }
}

