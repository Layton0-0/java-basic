package quiz_mid01.quiz06;

import java.time.LocalDate;

public class TestLoopPlus {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2024, 1, 1);
        for (int i = 0; i < 5; i++) {
            System.out.println("날짜 " + (i + 1) + ": " + date.plusWeeks(i * 2));
        }
    }
}
