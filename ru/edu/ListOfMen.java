package ru.edu;

import java.util.List;

public class ListOfMen {
    private static final ListOfMen INSTANCE = new ListOfMen();
    //todo можно потом в бд засунуть
    private ListOfMen() {
    }

    List<String> man = List.of("Иванов Сергей Владимирович",
            "Бобров Сергей Юрьевич",
            "Антонова Елена Игоревна",
            "Соколов Семён Николаевич",
            "Ромашова Ольга Яковлевна",
            "Леонидова Алёна Тимуровна",
            "Храмов Виктор Александрович",
            "Комаров Иван Дмитриевич",
            "Орлова Анна Павловна",
            "Петров Пётр Петрович");

    public String getManOfIndex(int index) {
        return (String) man.get(index);
    }

    public static ListOfMen getInstance() {
        return INSTANCE;
    }

}
