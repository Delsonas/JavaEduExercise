import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        DocManager docManager = new DocManager();
        ReportMaker reportMaker = new ReportMaker();
        Map<String, List<Document>> sortedDocsOfAuthor = reportMaker.sorting(docManager.createDocs(10));
        reportMaker.makeRep(sortedDocsOfAuthor);
    }

}
