package OOP.Abstraction;

public class testVehicle {
    public static void main(String[] args) {
        Manufacturer m1 = new Manufacturer("Porsche", "Germany");
        Manufacturer m2 = new Manufacturer("Boeing", "USA");

        Vehicle v1 = new Car(m1, "gasoline");
        Plane p1 = new Plane(m2,"Jet Fuel");

        System.out.println(v1.maxSpeed());
        System.out.println(p1.maxSpeed());

        Car myCar = (Car) v1;
        myCar.openRoof();

        ((Car) v1).openRoof();
    }
}
