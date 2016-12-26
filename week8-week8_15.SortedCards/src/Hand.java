
import java.util.ArrayList;
import java.util.Collections;


public class Hand implements Comparable <Hand>{
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
    
    public void sort() {
        Collections.sort(handOfCards);
    }
    
    public int compareTo (Hand hand){
        int thisValues = 0;
        int thisSuites = 0;
        int otherValues = 0;
        int otherSuites = 0;
        for (Card card : this.handOfCards) {
            thisValues += card.getValue();
            thisSuites += card.getSuit();
            
        }
        for (Card card : hand.handOfCards) {
            otherValues += card.getValue();
            otherSuites += card.getSuit();
        }
        return (thisValues + thisSuites) - (otherValues + otherSuites);
    }
    
}
