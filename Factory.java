import java.util.Random;

public class Factory {
    public Document crtDoc(TypeOfDoc type) {
        Document doc = null;
    //todo остальные сеттеры можно сделать тоже с "рандомным" заполнением
        RandomGenerator generator = new RandomGenerator();

        switch (type) {
            case TASKDOCUMENT:
                TaskDocBuilder a = new TaskDocBuilder();
                a.setDateOfTask(generator.gnrRndDate());
                a.setTermOfTask(generator.gnrRndDate());
                a.setRespOfTask(generator.gnrRndMan());
                a.setSignOfTask("да");
                a.setCtrlOfTask(generator.gnrRndMan());
                a.setAuthorOfDoc(generator.gnrRndMan());
                a.setIdOfDoc(generator.gnrId());
                a.setNameOfDoc(generator.gnrName());
                a.setNumOfDoc(generator.gnrRegNum());
                a.setTextOfDoc(generator.gnrText());
                a.setDateOfDoc(generator.gnrRndDate());
                doc = a.build();
                break;
            case INCOMINGDOCUMENT:
                InDocBuilder b = new InDocBuilder();
                b.setAdrOfInc(generator.gnrRndMan());
                b.setDateOfInc(generator.gnrRndDate());
                b.setNumbOfInc("fvd-1");
                b.setSendOfInc(generator.gnrRndMan());
                b.setAuthorOfDoc(generator.gnrRndMan());
                b.setIdOfDoc(generator.gnrId());
                b.setNameOfDoc(generator.gnrName());
                b.setNumOfDoc(generator.gnrRegNum());
                b.setTextOfDoc(generator.gnrText());
                b.setDateOfDoc(generator.gnrRndDate());
                doc = b.build();
                break;
            case OUTGOINGDOCUMENT:
                OutDocBuilder c = new OutDocBuilder();
                c.setAdrOfOut(generator.gnrRndMan());
                c.setWayOfOut("машина");
                c.setAuthorOfDoc(generator.gnrRndMan());
                c.setIdOfDoc(generator.gnrId());
                c.setNameOfDoc(generator.gnrName());
                c.setNumOfDoc(generator.gnrRegNum());
                c.setTextOfDoc(generator.gnrText());
                c.setDateOfDoc(generator.gnrRndDate());
                doc = c.build();
                break;

        }
        return doc;
    }
}
