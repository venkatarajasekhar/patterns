package creational.builder.custombuilder;

/**
 * Created by roman on 8/18/16.
 */
public class FordMustangBuilder extends CarBuilder {
    @Override
    void buildMark() {
        car.setMark("Ford GT Mustang");
    }

    @Override
    void buildTransmission() {
        car.setTransmission(Transmission.MANUAL);
    }

    @Override
    void buildMaxSpeed() {
        car.setMaxSpeed(310);
    }
}
