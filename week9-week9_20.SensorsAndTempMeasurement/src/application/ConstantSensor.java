package application;

/**
 * Created by anastasia on 03/01/2017.
 */
public class ConstantSensor implements Sensor {
    private int measurement;
    private boolean switched = true;

    public ConstantSensor (int measurement) {
        this.measurement = measurement;
    }

    @Override
    public boolean isOn() {
        return this.switched;
    }

    @Override
    public void off() {
        this.switched = false;

    }

    @Override
    public void on() {
        this.switched = true;

    }

    @Override
    public int measure() {
        return this.measurement;
    }
}
