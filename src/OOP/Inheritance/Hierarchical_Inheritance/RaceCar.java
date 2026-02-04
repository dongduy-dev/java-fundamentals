package OOP.Inheritance.Hierarchical_Inheritance;

class RaceCar extends PorscheFactory {
    boolean hasRollCage = true;
    boolean hasSlicks = true; // Slick tires (no grooves)

    void pitStop() {
        System.out.println("Box Box Box! Changing tires in 2.5 seconds.");
    }
}