package creational.builder.custombuilder;

public class Car {

    private String mark;
    private Transmission transmission;
    private int maxSpeed;

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", transmission=" + transmission +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
