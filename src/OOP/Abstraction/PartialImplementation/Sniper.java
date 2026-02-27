package OOP.Abstraction.PartialImplementation;

// 3. Concrete Implementation: Only focuses on unique behaviors
class Sniper extends BaseCharacter {
    public Sniper(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(name + " is crawling stealthily.");
    }

    @Override
    public void attack() {
        System.out.println(name + " fires a long-range precision shot!");
    }
}
