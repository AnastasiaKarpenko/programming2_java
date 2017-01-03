package application;

import java.util.Random;

/**
 * Created by anastasia on 03/01/2017.
 */
public class Thermometer implements Sensor {

    private boolean notSwitched = false;
    Random random = new Random();

    @Override
    public void off() {
        this.notSwitched = true;

    }

    @Override
    public void on() {
        this.notSwitched = false;

    }

    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public int measure() {
        if (isOn()) {
            return random.nextInt(61) - 30;
        }

        throw new IllegalArgumentException("Thermometer is off, switch it on first!");

    }
}
