import java.time.LocalDate;
import java.util.List;
import java.util.Random;

public class RandomGenerator {
    Random rand = new Random();

    public LocalDate gnrRndDate() {
        //todo переделать так, чтобы не вылезала ошибка с 29 февраля в невисокосных годах
        /*int year = rand.nextInt((2023 - 1998) + 1) + 1998;
        int month = rand.nextInt((12 - 1) + 1) + 1;
        int day = rand.nextInt((30 - 1) + 1) + 1;
        LocalDate date = LocalDate.of(year, month, day);*/

        return LocalDate.of(2021,11,13);
    }

    public String gnrRndMan() {
        int rnd = (int) (Math.random() * (9 - 0) + 0);
        return ListOfMen.getInstance().getManOfIndex(rnd);
    }

    public int gnrRegNum() {
        return rand.nextInt(1000 - 1) + 1;
    }

    public int gnrId() {
        return (int) Math.random() * (1000000 - 1) + 1;
    }
    //todo можно потом заполнить, если надо будет (плюс ещё раз проверить эти рандомы)
    public String gnrName() {
        return "Название документа";
    }

    public String gnrText() {
        return "Текст документа";
    }
}
