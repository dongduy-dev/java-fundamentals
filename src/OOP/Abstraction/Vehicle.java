package OOP.Abstraction;

public abstract class Vehicle {
    protected String vehicleType;
    protected Manufacturer manufacturer;

    public Vehicle(String vehicleType, Manufacturer manufacturer) {
        this.vehicleType = vehicleType;
        this.manufacturer = manufacturer;
    }

    //getter setter
    public String getVehicleType() {
        return vehicleType;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    //methods
    public String getManufacturerName() {
        return manufacturer.getName();
    }

    public void start() {
        System.out.println("Starting Vehicle");
    }

    public void accelerate() {
        System.out.println("Accelerating Vehicle");
    }

    public void stop() {
        System.out.printf("Stopping Vehicle");
    }

    public abstract double maxSpeed();
}














