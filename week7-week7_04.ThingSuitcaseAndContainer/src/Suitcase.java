
import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Thing>things;
    private int weightLimit;
    private int totalWeight;
    
    public Suitcase(int weightLimit) {
        this.weightLimit = weightLimit;
        things = new ArrayList<Thing>();
        this.totalWeight = 0;
    }
    
    public void addThing(Thing thing) {
        
        for ( int i = 0; i < things.size(); i++) {
            this.totalWeight += thing.getWeight();
        }
        if ((this.totalWeight + thing.getWeight()) <= this.weightLimit) {
            things.add(thing);
        }
        
    }
    
    public String toString() {
       
        String word = "";
        for (Thing thing : things) {
            this.totalWeight += thing.getWeight();
        }
        if (things.size() == 0) {
            word = "empty";
            return word + "(" + totalWeight + " kg)";
        } else if (things.size() == 1) {
            word = " thing (";
            return things.size() + word + totalWeight + " kg)";
        } else {
           return things.size() + " things (" + totalWeight + " kg)"; 
        }
//        return things.size() + " things (" + totalWeight + " kg)";
    }
    
   public void printThings () {
       System.out.println("Your suitcase contains the following things:");
        for (Thing t : things) {
            System.out.println(t.getName() + "( " + t.getWeight() + " kg)");
            totalWeight += t.getWeight();
        }
        System.out.println("Total weight: " + totalWeight + " kg");
       
   }
   
   public int totalWeight () {
       
       for (Thing thing : things) {
           this.totalWeight += thing.getWeight();
       }
       return this.totalWeight;
   }
}
