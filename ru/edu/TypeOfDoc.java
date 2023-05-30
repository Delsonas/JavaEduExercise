package ru.edu;

import java.util.Random;

public enum TypeOfDoc {
    TASKDOCUMENT,
    INCOMINGDOCUMENT,
    OUTGOINGDOCUMENT;

    private static final Random rnd = new Random();

    public static TypeOfDoc rndType() {
        TypeOfDoc[] types = values();
        return types[rnd.nextInt(types.length)];
    }
}
