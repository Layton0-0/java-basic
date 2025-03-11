package quiz_mid02.quiz10;

import java.util.Arrays;

public class Subway {
    public static void main(String[] args) {
        Sandwich eggMayo = new Sandwich("eggMayo", 5);
        Sandwich blt = new Sandwich("B.L.T", 1);
        Sandwich chicken = new Sandwich("chicken", 7);

        Sandwich[] menu = {eggMayo, blt, chicken};
        Arrays.sort(menu);
        System.out.println("기본 Comparable 정렬 : " + Arrays.toString(menu));

        Arrays.sort(menu, new RankComparator());
        System.out.println("커스텀 Comparator 정렬 : " + Arrays.toString(menu));
    }
}
