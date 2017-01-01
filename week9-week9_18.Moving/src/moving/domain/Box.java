package moving.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by anastasia on 01/01/2017.
 */
public class Box implements Thing {
    private int maximumCapacity;
    private List<Thing> things;

    public Box(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
        things = new ArrayList<>();
    }

    public boolean addThing(Thing thing) {
        if (thing.getVolume() > (this.maximumCapacity - this.getVolume())) {
            return false;
        } else {
            things.add(thing);
            return true;
        }

    }

    @Override
    public int getVolume() {
        int volume = 0;
        for (Thing thing : things) {
            volume += thing.getVolume();
        }

        return volume;
    }

}