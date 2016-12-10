import java.util.ArrayList;    
import java.util.*;


public class Changer {
    private ArrayList<Change> changes;
    
    public Changer() {
        changes = new ArrayList<Change>();
        
    }
    
    public void addChange(Change change) {
        changes.add(change);
    }
    
    public String change(String characterString){
        for (Change change : changes) {
            characterString = change.change(characterString);
        }
        return characterString;
    }   
    
}
