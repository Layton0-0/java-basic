package quiz_mid02.quiz03;

public class UnitPrinter {
    public static <T extends BioUnit> void printV1(Shuttle<T> t) {
        t.showInfo();
    }

    public static void printV2(Shuttle<? extends BioUnit> t) {
        t.showInfo();
    }
}
