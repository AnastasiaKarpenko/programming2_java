
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Storehouse {
    private Map<String, Integer> prices; 
    private Map<String, Integer> stocks;
    
    
    public Storehouse() {
        prices = new HashMap <String, Integer>();
        stocks = new HashMap <String, Integer>();
    }
    
    public void addProduct(String product, int price, int stock) {
        prices.put(product, price);
        stocks.put(product, stock);
    }
    
    public int price(String product) {
        if (!prices.containsKey(product)) {
            return -99;
        }
        return prices.get(product);
    }
}
