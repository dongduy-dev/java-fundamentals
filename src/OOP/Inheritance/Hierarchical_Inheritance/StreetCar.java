package OOP.Inheritance.Hierarchical_Inheritance;

class StreetCar extends PorscheFactory {
    boolean hasAirConditioning = true;

    void driveToWork() {
        System.out.println("Driving comfortably with AC on.");
    }

    @Override
    void checkEngine() {
        System.out.println("4.0-liter naturally aspirated flat-six engine");
        System.out.println("Using Premium Pump Gas");
    }
}
