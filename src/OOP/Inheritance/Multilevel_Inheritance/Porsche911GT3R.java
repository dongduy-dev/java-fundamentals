package OOP.Inheritance.Multilevel_Inheritance;

class Porsche911GT3R extends RaceCar {
    // This IS A RaceCar, so it has a roll cage and slicks automatically.

    String engine = "4.2L Flat-6 Naturally Aspirated";

    void activatePitLimiter() {
        System.out.println("Speed limited to 60km/h for pit lane entry.");
    }
}