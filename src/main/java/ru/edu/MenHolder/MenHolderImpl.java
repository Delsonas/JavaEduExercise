package ru.edu.MenHolder;

import org.springframework.stereotype.Component;
import ru.edu.MenHolder.MenHolder;

import java.util.List;

@Component
public class MenHolderImpl implements MenHolder {

    private final List<String> people = List.of("Иванов Сергей Владимирович",
            "Бобров Сергей Юрьевич",
            "Антонова Елена Игоревна",
            "Соколов Семён Николаевич",
            "Ромашова Ольга Яковлевна",
            "Леонидова Алёна Тимуровна",
            "Храмов Виктор Александрович",
            "Комаров Иван Дмитриевич",
            "Орлова Анна Павловна",
            "Петров Пётр Петрович");
    @Override
    public List<String> getPeople() {
        return people;
    }
    @Override
    public String getManOfIndex(int index) {
        return people.get(index);
    }
}
