
import java.util.ArrayList;


public class Container {
    private int maximumWeight;
    private ArrayList<Suitcase> container;
    
    public Container (int maximumWeight) {
        this.maximumWeight = maximumWeight;  
        container = new ArrayList <Suitcase>();
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if (suitcase.totalWeight() + this.getTotalWeight() <= this.maximumWeight) {
            container.add(suitcase);
        } 
        
        
    }
    
    public int getTotalWeight() {
        int totalWeight = 0;
        for (Suitcase suitcase : container) {
            totalWeight += suitcase.totalWeight();    
        }
        return totalWeight;
    }   
    
    public String toString() {
       return this.container.size() + " suitcases (" + this.getTotalWeight() 
               + " kg)";
    }
    
    public void printThings() {
        for (Suitcase suitcase : container) {
            suitcase.printThings();
        }
    }
    
}
