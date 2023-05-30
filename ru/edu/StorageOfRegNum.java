package ru.edu;

import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class StorageOfRegNum {
    Set<Integer> regNum = new HashSet<>();

    void adding(int a) {
        if (regNum.contains(a)) {
            throw new DocumentExistsException("Документ с таким регистарционным " +
                    "номером уже существует!" + a);
        } else {
            regNum.add(a);
        }

    }
}
