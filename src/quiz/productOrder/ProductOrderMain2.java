package quiz.productOrder;

// 클래스 안에 main() 메서드를 포함하여,
// 여러 상품의 주문 정보를 배열로 관리하고,
// 그 정보들을 출력하고,
// 최종 결제 금액을 계산하여 출력하자.
public class ProductOrderMain2 {
    public static void main(String[] args) {
        // 여러 상품의 주문 정보를 담는 배열 생성
        ProductOrder[] orders = new ProductOrder[3];
        // createOrder()를 여러번 사용해서 상품 주문 정보들을 생성하고 배열에 저장
        orders[0] = createOrder("두부", 2000, 2);
        orders[1] = createOrder("김치", 5000, 1);
        orders[2] = createOrder("콜라", 1500, 2);
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
