package lab9;

/**
 * Sensor
 */
public interface Sensor {
    boolean isOn();
    void on();
    void off();
    int measure();
}