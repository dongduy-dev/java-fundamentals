package OOP.Inheritance.Multilevel_Inheritance;

class GT3RRennsport extends Porsche911GT3R {

    // It gets the 4.2L engine, the roll cage, and the brand name automatically.

    void hugeRearWing() {
        System.out.println("Massive downforce generated. Stuck to the track.");
    }

    @Override
    void checkEngine() {
        // Overriding the Great-Grandparent method
        System.out.println("Engine tuned to 611 HP! Loudest Porsche ever.");
    }
}
