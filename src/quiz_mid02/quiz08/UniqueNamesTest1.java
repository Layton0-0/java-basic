package quiz_mid02.quiz08;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueNamesTest1 {
    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};

        Set<Integer> set = new HashSet<>(List.of(inputArr));
        for(int i: set) System.out.println(i);
    }
}
