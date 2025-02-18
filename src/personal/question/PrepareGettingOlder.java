package personal.question;

import java.text.NumberFormat;

public class PrepareGettingOlder {
    // 인상률
    static final double RATE = 1.035;
    // 명절 상여 빼기
    static final double PER_MONTH = 0.9;
    // 올해
    static final int THIS_YEAR = 2024;
    // 세금
    static final double TAX = 0.073;
    static final double SANG_YEO = 0.69;
    // 동호회 비 + 과학인
    static final int DONG_HO = 55000;

    public static void main(String[] args) {
        NumberFormat nf = NumberFormat.getInstance();
        nf.setGroupingUsed(true);

        // 현재 연봉
        int per_year = 44000000;
        int per_month = calculatePerMonth(per_year);
        // 노예 기간
        final int duration = 35;
        for(int i = THIS_YEAR; i <= THIS_YEAR + duration; i++) {
            System.out.println(i - THIS_YEAR + "년 후");
            System.out.println(i + "년의 연봉: " + nf.format(per_year));
            System.out.println(i + "년의 월급: " + nf.format(per_month));
            System.out.println(i + "년의 상여: " + nf.format(per_month * SANG_YEO));
            System.out.println();

            per_year = (int) (per_year * RATE);
            // 진급
            if(i == 2024 || i == 2028) per_year = (int) (per_year * (RATE + 0.1));
            per_month = calculatePerMonth(per_year);
        }
    }

    private static int calculatePerMonth(int per_year) {
        return (int) (per_year * TAX * PER_MONTH) - DONG_HO;
    }
}
