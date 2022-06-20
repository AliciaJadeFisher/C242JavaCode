package Demos;

public class Car {

    private final String make;
    private final String model;
    private int cc;
    private String colour;
    private int speed;

    public Car(String make, String model) {
        this(make, model, 0, "white");
    }

    public Car(String make, String model, int cc, String colour) {
        this.make = make;
        this.model = model;
        this.cc = cc;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return getClass() + ": make = " + make +
                ", model = " + model +
                ", cc = " + cc +
                ", colour = " + colour +
                ", speed = " + speed;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}