package OOP.Inheritance.Hierarchical_Inheritance;

public class TestEngine {
    public static void main(String[] args) {
        PorscheFactory factory = new PorscheFactory();
        RaceCar r1 = new RaceCar();
        StreetCar s2 = new StreetCar();

        factory.checkEngine();
        r1.checkEngine();
        s2.checkEngine();

    }
}


