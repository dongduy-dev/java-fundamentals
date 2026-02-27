package OOP.Abstraction.PartialImplementation;

// 2. Partial Implementation: Handles the "boring" stuff every character does
abstract class BaseCharacter implements IGameCharacter {
    protected String name;

    public BaseCharacter(String name) {
        this.name = name;
    }

    @Override
    public void heal() {
        // Every character heals the same way
        System.out.println(name + " is recovering health points...");
    }

    // move() and attack() are NOT implemented here.
    // They are left for the concrete classes.
}
