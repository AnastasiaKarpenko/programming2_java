
import java.util.HashMap;
import java.util.Map;


public class ShoppingBasket {
    private Map<String, Purchase> basket;
    
    public ShoppingBasket () {
        this.basket = new HashMap<String, Purchase>();
    }
    
    public void add(String product, int price) {
       if (basket.containsKey(product)) {
           basket.get(product).increaseAmount();
       }
       basket.put(product, new Purchase (product, 1, price));
    }
    
    public int price() {
        int price = 0;
        for (Purchase purchase : basket.values()) {
            price += purchase.price();
        }
        return price;
    }
}
