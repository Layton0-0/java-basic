package quiz_basic.quiz12.pay0;

public class PayService {

    public void processPay(String option, int amount) {
        boolean result;
        System.out.println("결제를 시작합니다: option=" + option + ", amount=" + amount);
        Pay pay = new DefaultPay();
        if (option.equals("kakao")) {
            pay = new KakaoPay();
        } else if (option.equals("naver")) {
            pay = new NaverPay();
        }

        result = pay.pay(amount);
        if (result) {
            System.out.println("결제가 성공했습니다.");
        } else {
            System.out.println("결제가 실패했습니다.");
        }
    }
}
