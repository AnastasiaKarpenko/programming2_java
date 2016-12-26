
public class Main {

    public static void main(String[] args) {
        ShoppingBasket basket = new ShoppingBasket();
        basket.add("milk", 3);
        basket.add("buttermilk", 2);
        basket.add("cheese", 5);

        basket.add("computer", 899);

        basket.print();
    }

}
