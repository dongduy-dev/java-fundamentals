package OOP.Inheritance.Multilevel_Inheritance;

class RaceCar {
    String brand = "Porsche";
    boolean hasRollCage = true;
    boolean hasSlicks = true; // Slick tires (no grooves)

    void checkEngine() {
        System.out.println("Engine Status: OK. Ready for German Engineering.");
    }

    void pitStop() {
        System.out.println("Box Box Box! Changing tires in 2.5 seconds.");
    }
}