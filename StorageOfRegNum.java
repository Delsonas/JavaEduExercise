import java.util.HashSet;
import java.util.Set;

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
