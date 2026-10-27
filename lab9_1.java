interface CelsiusSensor {
    double getCelsius();
}

class FahrenheitSensor {
    public double getFahrenheit() { return 98.6; }
}

class SensorAdapter implements CelsiusSensor {
    private FahrenheitSensor sensor;

    public SensorAdapter(FahrenheitSensor sensor) {
        this.sensor = sensor;
    }

    public double getCelsius() {
        return (sensor.getFahrenheit() - 32) * 5.0 / 9.0;
    }
}

public class lab9_1 {
    public static void main(String[] args) {
        FahrenheitSensor oldSensor = new FahrenheitSensor();
        System.out.println("Sensor reading: " + oldSensor.getFahrenheit() + " F");

        CelsiusSensor sensor = new SensorAdapter(oldSensor);
        System.out.printf("Shown in app: %.1f C%n", sensor.getCelsius());
    }
}
