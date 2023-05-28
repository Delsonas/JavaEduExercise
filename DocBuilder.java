import java.time.LocalDate;

public abstract class DocBuilder {
    public int idOfDoc;
    public String nameOfDoc;
    public String textOfDoc;
    public int numOfDoc;
    public LocalDate dateOfDoc;
    public String authorOfDoc;


    public int getNumOfDoc() {

        return numOfDoc;
    }

    public LocalDate getDateOfDoc() {

        return dateOfDoc;
    }

    public DocBuilder setIdOfDoc(int idOfDoc) {
        this.idOfDoc = idOfDoc;
        return this;
    }

    public DocBuilder setNameOfDoc(String nameOfDoc) {
        this.nameOfDoc = nameOfDoc;
        return this;
    }

    public DocBuilder setTextOfDoc(String textOfDoc) {
        this.textOfDoc = textOfDoc;
        return this;
    }

    public DocBuilder setNumOfDoc(int numOfDoc) {

        this.numOfDoc = numOfDoc;
        return this;
    }

    public DocBuilder setDateOfDoc(LocalDate dateOfDoc) {
        this.dateOfDoc = dateOfDoc;
        return this;
    }

    public DocBuilder setAuthorOfDoc(String authorOfDoc) {
        this.authorOfDoc = authorOfDoc;
        return this;
    }

    public abstract Document build();
    //todo заполняются только сеттеры документа, отдельные сеттеры разных типов документов пустые, можно потом их тоже заполнить

}
