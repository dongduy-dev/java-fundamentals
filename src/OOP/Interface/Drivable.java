package OOP.Interface;

// Defining the interfaces
interface Drivable {
    // implicitly public static final
    int MAX_SPEED = 120;

    // implicitly public abstract
    void startEngine();
    void accelerate(int speed);
}

interface Navigable {
    void setDestination(String address);
}

// A class implementing multiple interfaces
class SmartCar implements Drivable, Navigable {
    private int currentSpeed = 0;

    @Override
    public void startEngine() {
        System.out.println("SmartCar engine started quietly.");
    }

    @Override
    public void accelerate(int speed) {
        if (speed <= MAX_SPEED) {
            this.currentSpeed = speed;
            System.out.println("Accelerating to " + currentSpeed + " km/h");
        } else {
            System.out.println("Speed limit exceeded!");
        }
    }

    @Override
    public void setDestination(String address) {
        System.out.println("GPS set to: " + address);
    }
}