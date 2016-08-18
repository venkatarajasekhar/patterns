package creational.builder.simplebuilder;

import creational.builder.custombuilder.Transmission;

public class Car {

    private final String mark;
    private final Transmission transmission;
    private final int maxSpeed;

    Car(final CarBuilder carBuilder) {
        this.mark = carBuilder.getMark();
        this.transmission = carBuilder.getTransmission();
        this.maxSpeed = carBuilder.getMaxSpeed();
    }
}
