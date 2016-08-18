package creational.builder.custombuilder;

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
