package ru.edu.RandomGenerator;

import java.time.LocalDate;
import java.util.List;

public interface RandomGenerator {
    LocalDate gnrRndDate();

    <T> T gnrRndMan(List<T> list);

    int gnrRegNum();

    int gnrId();

    String gnrName();

    String gnrText();
}
