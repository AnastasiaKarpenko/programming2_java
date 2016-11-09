
import java.util.ArrayList;

public class Suitcase {

    private int mMaxWeight;
    private ArrayList<Thing> things;

    public Suitcase(int maxWeight) {
        mMaxWeight = maxWeight;
        things = new ArrayList<Thing>();

    }

    public void addThing(Thing thing) {
        if (!this.doesExceedWeight(thing)) {
            things.add(thing);
        }
    }

    public String toString() {

        if (things.isEmpty()) {
            return "empty " + "(" + this.totalWeight() + " kg)";
        } else if (things.size() == 1) {
            return things.size() + " thing (" + this.totalWeight() + " kg)";
        } else {
            return things.size() + " things (" + this.totalWeight() + " kg)";
        }
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Thing thing : things) {
            totalWeight += thing.getWeight();
        }
        return totalWeight;
    }
    
    public boolean doesExceedWeight (Thing thing) {
        return (this.totalWeight() + thing.getWeight()) > mMaxWeight;
    }
    
    public void printThings () {
        for (Thing thing : things) {
            System.out.println(thing.getName() + "( " + thing.getWeight() + " kg)");
        }
    }
    
    
    
    

}
