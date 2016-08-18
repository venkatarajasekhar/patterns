package creational.builder.custombuilder;

/**
 * Created by roman on 8/18/16.
 */
public abstract class CarBuilder {

    Car car;

    void createCar() {
        car = new Car();
    }

    abstract void buildMark();

    abstract void buildTransmission ();

    abstract void buildMaxSpeed ();

    Car getCar() {
        return car;
    }

}
