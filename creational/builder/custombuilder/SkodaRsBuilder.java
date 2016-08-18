package creational.builder.custombuilder;

/**
 * Created by roman on 8/18/16.
 */
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
