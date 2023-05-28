public class OutDocBuilder extends DocBuilder {
    public String adrOfOut;
    public String wayOfOut;

    Document doc = new OutgoingDocument();

    public OutDocBuilder setAdrOfOut(String adrOfOut) {
        this.adrOfOut = adrOfOut;
        return this;
    }

    public OutDocBuilder setWayOfOut(String wayOfOut) {
        this.wayOfOut = wayOfOut;
        return this;
    }

    @Override
    public Document build() {
        doc.setIdOfDoc(idOfDoc);
        doc.setNameOfDoc(nameOfDoc);
        doc.setTextOfDoc(textOfDoc);
        doc.setNumOfDoc(numOfDoc);
        doc.setDateOfDoc(dateOfDoc);
        doc.setAuthorOfDoc(authorOfDoc);
        return doc;
    }
}
