package creational.builder.simplebuilder;

import creational.builder.custombuilder.Transmission;

/**
 * Created by roman on 8/18/16.
 */
public class CarBuilder {

    private String mark;
    private Transmission transmission;
    private int maxSpeed;

    public CarBuilder mark(String mark) {
        this.mark = mark;
        return this;
    }

    public CarBuilder transmission(Transmission transmission) {
        this.transmission = transmission;
        return this;
    }

    public CarBuilder maxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
        return this;
    }

    public String getMark() {
        return mark;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public Car build() {
        return new Car(this);
    }
}
