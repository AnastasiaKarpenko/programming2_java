/**
 * Created by anastasia on 01/01/2017.
 */
public class Item implements Thing{
    private String name;
    private int volume;

    public Item(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public int getVolume() {
        return this.volume;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.getName() + " (" + this.getVolume() + " dm^3)";
    }

}
