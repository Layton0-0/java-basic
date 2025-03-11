package personal.question;

import java.text.DecimalFormat;

public class DebtSimulator {
    static final int MONTH = 12;
    static DecimalFormat fm = new DecimalFormat("###,###,###,###");

    public static void main(String[] args) {
        int debt = 350000000;

        int duration = 40;
        final int returnPerYear = 30000000;
        final double interestRate = 0.0387;

        double rate = interestRate / MONTH; // 예: 연이율 5%를 월이율로 변환
        int nper = duration * MONTH; // 예: 30년을 월 단위로 변환

        double totalDebt1 = calculatePMT(rate, nper, debt, returnPerYear);
        System.out.println("====================================================");

        double totalDebt2 = calculateAnother(rate, nper, debt, returnPerYear);

        System.out.println("원리금 총액: " + fm.format(totalDebt1));
        System.out.println("원금 총액: " + fm.format(totalDebt2));

        if (totalDebt1 > totalDebt2) {
            System.out.println("원리금 상환으로 하면 손해는 총 " + fm.format(totalDebt1 - totalDebt2) + "원 입니다.");
        }
    }

    // 원리금균등상환
    public static double calculatePMT(double rate, int nper, double debt, int returnPerYear) {
        double result = 0;
        double perMonth = (rate * debt) / (1 - Math.pow(1 + rate, -nper));
        while (nper > 0) {
            System.out.println(2027 + (40 - nper / 12) + "년 원리금 월 상환액: " + fm.format(perMonth));
            if (nper < 445 && nper % 12 == 0) {
                debt -= returnPerYear;
                result += returnPerYear;
                perMonth = (rate * debt) / (1 - Math.pow(1 + rate, -nper));
                System.out.println("==원리금 이자 줄어든다==");
            }
            if(debt < 0) return result - debt;
            result += perMonth;
            nper--;
        }

        return result;
    }

    // 원금균등상환
    public static double calculateAnother(double rate, int nper, double debt, int returnPerYear) {
        double result = 0;
        double principal = debt / nper;
        while (nper > 0) {
            double interest = debt * rate;
            if (nper < 480 && nper % 12 == 0) {
                debt -= returnPerYear;
                result += returnPerYear;
                principal = debt / nper;
                System.out.println("==원금 이자 줄어든다==");
            }
            if(debt < 0) return result - debt;
            debt -= principal;
            result += principal + interest;
            System.out.println(2027 + (40 - nper / 12) + "년 원금 월 상환액 : " + fm.format(Math.ceil(principal + interest)));
            nper--;
        }
        return result;
    }

}
