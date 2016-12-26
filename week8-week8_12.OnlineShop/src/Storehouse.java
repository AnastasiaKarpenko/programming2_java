
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
    
    public int stock(String product) {
        if (stocks.get(product) == null) {
            return 0;
        }
        return stocks.get(product);
    }
    
    public boolean take(String product) {
        if (stocks.get(product) == null) {
            return false;
        } else if (this.stock(product) > 0) {
            stocks.put(product, this.stock(product)- 1);
        }
        return true;
    }
}
