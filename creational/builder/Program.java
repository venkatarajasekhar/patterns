package creational.builder;

import creational.builder.custombuilder.Director;
import creational.builder.custombuilder.FordMustangBuilder;
import creational.builder.custombuilder.Transmission;
import creational.builder.simplebuilder.Car;
import creational.builder.simplebuilder.CarBuilder;

public class Program {

    public static void main(String[] args) {
        //simple builder
        Car contact = new CarBuilder()
                .mark("Porshe 911")
                .transmission(Transmission.AUTO)
                .maxSpeed(290)
                .build();

        //custom builder
        Director director = new Director();
        director.setBuilder(new FordMustangBuilder());
        creational.builder.custombuilder.Car car = director.buildCar();
    }

}
