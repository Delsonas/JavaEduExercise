package ru.edu.StorageOfRegNum;

import org.springframework.stereotype.Component;
import ru.edu.Document.DocumentExistsException;

import java.util.HashSet;
import java.util.Set;

@Component
public class StorageOfRegNumImpl implements StorageOfRegNum {
    private final Set<Integer> regNum = new HashSet<>();

    @Override
    public void adding(int a) {
        if (regNum.contains(a)) {
            throw new DocumentExistsException("Документ с таким регистарционным " +
                    "номером уже существует!" + a);
        } else {
            regNum.add(a);
        }

    }
}
