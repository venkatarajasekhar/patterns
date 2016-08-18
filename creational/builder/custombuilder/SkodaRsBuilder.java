package creational.builder.custombuilder;

public class SkodaRsBuilder extends CarBuilder{

    @Override
    void buildMark() {
        car.setMark("Skoda RS");
    }

    @Override
    void buildTransmission() {
        car.setTransmission(Transmission.AUTO);
    }

    @Override
    void buildMaxSpeed() {
        car.setMaxSpeed(285);
    }

}
