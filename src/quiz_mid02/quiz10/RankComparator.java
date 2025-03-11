package quiz_mid02.quiz10;

import java.util.Comparator;

public class RankComparator implements Comparator<Sandwich> {
    @Override
    public int compare(Sandwich o1, Sandwich o2) {
        return Integer.compare(o1.getRank(), o2.getRank());
    }
}
