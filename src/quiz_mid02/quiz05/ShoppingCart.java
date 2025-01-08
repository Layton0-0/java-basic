package quiz_mid02.quiz05;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void displayItems() {
        int sum = 0;
        System.out.println("장바구니 상품 출력");
        for (Item i : items) {
            sum += i.getTotalPrice();
            System.out.println("상품명:" + i.getName() + ", 합계:" + i.getTotalPrice());
        }
        System.out.println("전체 가격 합:" + sum);
    }
}
