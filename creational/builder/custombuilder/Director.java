package creational.builder.custombuilder;

/**
 * Created by roman on 8/18/16.
 */
public class Director {

    CarBuilder builder;

    public void setBuilder(CarBuilder builder) {
        this.builder = builder;
    }

    public Car buildCar() {
        builder.createCar();

        builder.buildMark();
        builder.buildTransmission();
        builder.buildMaxSpeed();

        return builder.getCar();
    }
}
