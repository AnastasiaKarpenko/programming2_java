
import java.util.ArrayList;


public class Hand {
    private ArrayList <Card> handOfCards;
    
    public Hand () {
        this.handOfCards = new ArrayList<Card>();
    }
    
    public void add(Card card) {
        handOfCards.add(card);
    }
    
    public void print() {
        for (Card card : handOfCards) {
            System.out.println(card);
        }
    }
    
}
