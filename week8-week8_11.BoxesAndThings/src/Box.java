
import java.util.ArrayList;


public class Box implements ToBeStored{
    private int maxWeight;
    private ArrayList <ToBeStored> things;
    
    public Box (int maxWeight) {
        this.maxWeight = maxWeight;
        things = new ArrayList <ToBeStored>();
    }
    
    public double weight () {
        double totalWeight = 0;
        for (ToBeStored thing : things) {
            totalWeight += thing.weight();
        }
        return totalWeight;
    }
    
    public void add (ToBeStored thing) {
        if ((this.maxWeight - this.weight()) >= thing.weight()) {
            things.add(thing);
        }
        
    }
    
    public String toString () {
        return "Box: " + things.size() + " things, total weight " 
                + this.weight() +" kg";
                
    }
    
}
