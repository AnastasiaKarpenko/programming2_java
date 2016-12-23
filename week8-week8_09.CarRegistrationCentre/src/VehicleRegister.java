
import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegister {
    private HashMap<RegistrationPlate, String> owners;
    
    public VehicleRegister () {
        owners = new HashMap <RegistrationPlate,String>();
    }
    
    public boolean add(RegistrationPlate plate, String owner) {
        if (owners.containsKey(plate)) {
             return false;
        }
        owners.put(plate, owner);   
        return true;
    }
    
    public String get(RegistrationPlate plate) {
        if (!owners.containsKey(plate)) {
            return null;
        } 
        return owners.get(plate);
    }
    
    public boolean delete(RegistrationPlate plate) {
        if (!owners.containsKey(plate)) {
            return false;
        }
        owners.remove(plate);
        return true;
    }
    
    public void printRegistrationPlates(){
        for (RegistrationPlate plate : owners.keySet()) {
            System.out.println(plate);
        }
    }
    
    public void printOwners() {
        ArrayList <String> ownerNames = new ArrayList <String>();
        for (String owner : owners.values()) {
            if (!ownerNames.contains(owner)) {
                ownerNames.add(owner);
            }
           
        }
        for (String name : ownerNames) {
            System.out.println(name);
        }
    }
    
}
