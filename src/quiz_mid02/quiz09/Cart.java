package quiz_mid02.quiz09;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<Product, Integer> cartMap = new HashMap<>();

    // to-do
    public void add(Product product, int amount) {
        cartMap.put(product, cartMap.getOrDefault(product, 0) + amount);
    }

    public void minus(Product product, int amount) {
        int newAmount = cartMap.getOrDefault(product, 0) - amount;
        if(newAmount > 0) cartMap.put(product, newAmount);
        else cartMap.remove(product);
    }

    public void printAll() {
        System.out.println("==모든 상품 출력==");
        for (Product product : cartMap.keySet()) {
            System.out.println("상품: " + product + " 수량: " + cartMap.get(product));
        }
    }
}
