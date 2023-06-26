package ru.edu.RandomGenerator;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;

/**
 * Для полей задаются "рандомные" значения
 */
@Component
public class RandomGeneratorImpl implements RandomGenerator {
    private final Random rand = new Random();

    @Override
    public LocalDate gnrRndDate() {

        return LocalDate.of(2021, 11, 13);
    }

    @Override
    public <T> T gnrRndMan(List<T> list) {
        int rnd = (int) (Math.random() * list.size());
        return list.get(rnd);
    }

    @Override
    public int gnrRegNum() {
        return rand.nextInt(1000 - 1) + 1;
    }

    @Override
    public int gnrId() {
        return (int) (Math.random() * (1000000 - 1) + 1);
    }

    @Override
    public String gnrName() {
        return "Название документа";
    }

    @Override
    public String gnrText() {
        return "Текст документа";
    }
}
