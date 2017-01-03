package application;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by anastasia on 03/01/2017.
 */
public class AverageSensor implements Sensor {
    private List<Sensor> sensors;

    public AverageSensor() {
        this.sensors = new ArrayList<Sensor>();
    }

    @Override
    public boolean isOn() {
        for (Sensor sensor : sensors) {
            if (!sensor.isOn()) {
                return false;
            }
        }

        return true;
    }

    @Override
    public void on() {
        for (Sensor sensor : sensors) {
            sensor.on();
        }

    }

    @Override
    public void off() {
        for (Sensor sensor : sensors) {
            sensor.off();
        }

    }

    @Override
    public int measure() {
        int avgTemp = 0;
        if (this.isOn()) {
            for (Sensor sensor : sensors) {
                avgTemp += sensor.measure();
            }

        } else if (!this.isOn() || sensors.isEmpty()) {
            throw new IllegalStateException("The sensor is off or empty!");
        }
        return avgTemp;
    }

    public void addSensor(Sensor additional) {
        sensors.add(additional);
    }
}
