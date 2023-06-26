package ru.edu.Document;

import java.util.Random;

public enum TypeOfDoc {
    TASK_DOCUMENT,
    INCOMING_DOCUMENT,
    OUTGOING_DOCUMENT;

    private static final Random rnd = new Random();

    public static TypeOfDoc rndType() {
        TypeOfDoc[] types = values();
        return types[rnd.nextInt(types.length)];
    }
}
