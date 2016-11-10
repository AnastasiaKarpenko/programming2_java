
import java.util.ArrayList;


public class Container {
    private int maximumWeight;
    private ArrayList<Suitcase> container;
    
    public Container (int maximumWeight) {
        this.maximumWeight = maximumWeight;  
        container = new ArrayList <Suitcase>();
    }
    
    public void addSuitcase(Suitcase suitcase) {
        container.add(suitcase);
        
    }
    
    public String toString() {
        
    }
    
}
