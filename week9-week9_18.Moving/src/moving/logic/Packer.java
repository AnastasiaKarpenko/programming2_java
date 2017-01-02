package moving.logic;

import moving.domain.Box;
import moving.domain.Item;
import moving.domain.Thing;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by anastasia on 01/01/2017.
 */
public class Packer {
    private int boxesVolume;
    private List<Box> boxes;

    public Packer(int boxesVolume) {
        this.boxesVolume = boxesVolume;
        this.boxes = new ArrayList<>();

    }

    public List<Box> packThings(List<Thing> things) {
        Box box = new Box (this.boxesVolume);
        boxes.add(box);
        for (Thing thing : things) {
            if (!boxes.get(boxes.size()-1).addThing(thing)) {
                boxes.add(new Box(this.boxesVolume));
                boxes.get(boxes.size()-1).addThing(thing);
            }
        }

        return this.boxes;

    }




}
