package OOP.Inheritance.Hierarchical_Inheritance;

class RaceCar extends PorscheFactory {
    boolean hasRollCage = true;
    boolean hasSlicks = true; // Slick tires (no grooves)

    void pitStop() {
        System.out.println("Box Box Box! Changing tires in 2.5 seconds.");
    }

    @Override
    void checkEngine() {
        System.out.println("4.0-liter naturally aspirated flat-six engine");
        System.out.println("Using Racing Fuel");
    }
}