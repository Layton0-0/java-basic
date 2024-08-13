package quiz_mid01.quiz04;

import java.util.Random;

public class LottoGenerator {
    private final Random random = new Random();
    private int[] lottoNums;
    private int count;

    public int[] generate() {
        lottoNums = new int[6];
        count = 0;

        while (count < 6) {
            int num = random.nextInt(45) + 1;
            if (isUnique(num)) {
                lottoNums[count] = num;
                count++;
            }
        }
        return lottoNums;
    }

    private boolean isUnique(int num) {
        for (int i = 0; i < count; i++) {
            if (lottoNums[i] == num) {
                return false;
            }
        }
        return true;
    }
}
