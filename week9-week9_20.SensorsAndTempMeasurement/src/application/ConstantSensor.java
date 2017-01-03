package application;

/**
 * Created by anastasia on 03/01/2017.
 */
public class ConstantSensor implements Sensor {
    private int measurement;

    public ConstantSensor (int measurement) {
        this.measurement = measurement;
    }

    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void off() {

    }

    @Override
    public void on() {

    }

    @Override
    public int measure() {
        return this.measurement;
    }
}
