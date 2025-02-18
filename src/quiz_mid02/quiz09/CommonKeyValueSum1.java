package quiz_mid02.quiz09;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CommonKeyValueSum1 {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 4);
        map2.put("C", 5);
        map2.put("D", 6);

        // 코드 작성
        Set<String> set1 = map1.keySet();
        Set<String> set2 = map2.keySet();

        set1.retainAll(set2);

        Map<String, Integer> resultMap = new HashMap<>();
        for (String s : set1) {
            resultMap.put(s, map1.get(s) + map2.get(s));
        }
        System.out.println(resultMap);
    }
}
