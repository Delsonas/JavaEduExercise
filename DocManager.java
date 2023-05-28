import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DocManager {

    public List<Document> listOfDocs = new ArrayList<>();
    private final Factory docCreator = new Factory();
    StorageOfRegNum regNum = new StorageOfRegNum();

    public List<Document> createDocs(int count) {
        int a;
        for (int i = count; i > 0; i--) {
            Document doc = this.docCreator.crtDoc(TypeOfDoc.rndType());
            a = doc.getNumOfDoc();
            regNum.adding(a);
            listOfDocs.add(doc);
        }
        return listOfDocs;
    }
}

