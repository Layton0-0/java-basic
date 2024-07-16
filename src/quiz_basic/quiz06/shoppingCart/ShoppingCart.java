package quiz_basic.quiz06.shoppingCart;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;

    public void addItem(Item item) {
        if (item.getQuantity() + itemCount > 10) {
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }
        items[itemCount] = item;
        itemCount++;
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        int total = 0;
        for (Item item : items) {
            if(item == null) break;
            System.out.println("상품명:" + item.getName() + ", 합계:" + item.getPrice() * item.getQuantity());
            total += item.getPrice() * item.getQuantity();
        }
        System.out.println("전체 가격 합:" + total);
    }
}
