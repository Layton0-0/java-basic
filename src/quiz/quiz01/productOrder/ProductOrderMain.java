package quiz.quiz01.productOrder;

public class ProductOrderMain {
    // ProductOrderMain 클래스 안에 main() 메서드를 포함하여,
    // 여러 상품의 주문 정보를 배열로 관리하고,
    // 그 정보들을 출력하고,
    // 최종 결제 금액을 계산하여 출력하자.

    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];
        int total = 0;

        ProductOrder order1 = new ProductOrder();
        order1.productName = "두부";
        order1.price = 2000;
        order1.quantity = 2;
        orders[0] = order1;

        ProductOrder order2 = new ProductOrder();
        order2.productName = "김치";
        order2.price = 5000;
        order2.quantity = 1;
        orders[1] = order2;

        ProductOrder order3 = new ProductOrder();
        order3.productName = "콜라";
        order3.price = 1500;
        order3.quantity = 2;
        orders[2] = order3;

        for (int i = 0; i < orders.length; i++) {
            total += orders[i].price * orders[i].quantity;
            System.out.println("상품명: " + orders[i].productName + ", 가격: " + orders[i].price + ", 수량: " + orders[i].quantity);
        }

        System.out.println("총 결제 금액: " + total);

    }
}
