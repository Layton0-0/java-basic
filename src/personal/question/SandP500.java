package personal.question;

import java.text.NumberFormat;

public class SandP500 {
    public static void main(String[] args) {
        NumberFormat nf = NumberFormat.getInstance();
        nf.setGroupingUsed(true);
        // 1주당 가격
        long seed = 770000;
        // 주 개수
        int howMany = 39;
        // 연 상승률
        final double I_RATE = 0.13;
        // 세금
        final double TAX = 0.22;
        // 연 공제 금액
        final int EX = 2500000;
        // 총 수익
        long totalEarn = 4500000;

        int startYear = 2024;
        int endYear = startYear + 10;

        for (int i = startYear; i < endYear + 1; i++) {
            long yearTax = 0;
            long yearEarn = 0;
            for (int j = 1; j < 13; j++) {
                if(i == 2024 && j < 7) continue;
                yearEarn += seed * I_RATE;
                seed *= ((I_RATE / 12) + 1);
                howMany++;
                System.out.printf("%d년 %d월 시드: %s, %d주 합계: %s", i, j, nf.format(seed), howMany, nf.format(seed * howMany));
                System.out.println();
            }
            totalEarn += yearEarn;
            yearTax = Math.round((totalEarn - EX) * TAX);
            System.out.printf("%d년 수익: %s, 합계: %s, 세금: %s, 실수령액: %s",
                    i, nf.format(yearEarn), nf.format(seed * howMany), nf.format(yearTax), nf.format(seed * howMany - yearTax));
            System.out.println();
            System.out.println();
        }
    }
}
