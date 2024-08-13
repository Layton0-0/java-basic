package quiz_mid01.quiz04;

public class LottoGeneratorMain {
    public static void main(String[] args) {
        LottoGenerator lg = new LottoGenerator();
        int[] lottoNums = lg.generate();

        System.out.print("로또 번호: ");
        for (int ln : lottoNums) {
            System.out.print(ln + " ");
        }
    }
}
