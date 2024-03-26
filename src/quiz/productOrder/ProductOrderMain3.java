package quiz.productOrder;

import java.util.Scanner;

// 아래 입력, 출력 예시를 참고해서 다음 사항을 적용하자.
// 주문 수량을 입력 받자
// 예) 입력할 주문의 개수를 입력하세요:
// 가격, 수량, 상품명을 입력 받자
// 입력시 상품 순서를 알 수 있게 "n번째 주문 정보를 입력하세요." 라는 메시지를 출력하세요.
// 입력이 끝나면 등록한 상품과 총 결제 금액을 출력하자.
public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int n = sc.nextInt();
        sc.nextLine();

        // 여러 상품의 주문 정보를 담는 배열 생성
        ProductOrder[] orders = new ProductOrder[n];
        // createOrder()를 여러번 사용해서 상품 주문 정보들을 생성하고 배열에 저장
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + "번째 주문 정보를 입력하세요.");

            System.out.print("상품명: ");
            String productName = sc.nextLine();

            System.out.print("가격: ");
            int price = sc.nextInt();

            System.out.print("수량: ");
            int quantity = sc.nextInt();
            sc.nextLine();

            orders[i] = createOrder(productName, price, quantity);
        }
        // printOrders()를 사용해서 상품 주문 정보 출력
        printOrders(orders);
        // getTotalAmount()를 사용해서 총 결제 금액 계산
        int totalAmount = getTotalAmount(orders);
        // 총 결제 금액 출력
        System.out.println("총 결제 금액: " + totalAmount);
    }

    // static ProductOrder createOrder(String productName, int price, int quantity)
    // ProductOrder 를 생성하고 매개변수로 초기값을 설정합니다.
    // 마지막으로 생성한 ProductOrder를 반환합니다.
    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;

        return productOrder;
    }

    // static void printOrders(ProductOrder[] orders)
    // 배열을 받아서 배열에 들어있는 전체 ProductOrder 의 상품명, 가격, 수량을 출력합니다.
    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
        }
    }

    // static int getTotalAmount(ProductOrder[] orders)
    // 배열을 받아서 배열에 들어있는 전체 ProductOrder 의 총 결제 금액을 계산하고, 계산 결과를 반환합니다.
    static int getTotalAmount(ProductOrder[] orders) {
        int total = 0;
        for (ProductOrder order: orders) {
            total += order.price * order.quantity;
        }
        return total;
    }
}
