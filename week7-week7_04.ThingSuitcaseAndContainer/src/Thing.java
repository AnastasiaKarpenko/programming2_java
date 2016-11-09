
public class Thing {
    private String mName;
    private int mWeight;
    
    public Thing( String name, int weight) {
        mName = name;
        mWeight = weight;
    }
    
    public String getName() {
        return mName;
    }
    
    public int getWeight() {
        return mWeight;
    }
    
    public String toString() {
        return this.getName() + "(" + this.getWeight() + " kg)";
    }
    
}
