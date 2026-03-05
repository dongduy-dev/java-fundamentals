package OOP.Abstraction;

public class Plane extends Vehicle {
    private String fuelType;

    public Plane(Manufacturer manufacturer, String fuelType) {
        super("Plane", manufacturer);
        this.fuelType = fuelType;
    }


    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public double maxSpeed() {
        return 1200;
    }

    //unique method only plane have
    public void takeOff() {
        System.out.println("Taking off");
    }
    public void land() {
        System.out.println("Landing");
    }
}
