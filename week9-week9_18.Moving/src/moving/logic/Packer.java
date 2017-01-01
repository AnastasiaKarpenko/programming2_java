package moving.logic;

import moving.domain.Box;
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
        for (Thing thing : things) {
            boxes.add((Box)thing);
        }

        return boxes;

    }
}
