package quiz_mid02.quiz08;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetOperationTest {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(List.of(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(List.of(3, 4, 5, 6, 7));

        Set<Integer> plusSet = new HashSet<>(set1);
        Set<Integer> sameSet = new HashSet<>(set1);
        Set<Integer> minusSet = new HashSet<>(set1);

        plusSet.addAll(set2);

        sameSet.retainAll(set2);

        minusSet.removeAll(set2);

        System.out.println("합집합: " + plusSet);
        System.out.println("교집합: " + sameSet);
        System.out.println("차집합: " + minusSet);
    }
}
