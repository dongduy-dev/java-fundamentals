package OOP.example;

public class dog extends animal{

    public dog(float height, float weight) {
        super(height, weight);
    }

    public void makeSound() {
        System.out.println("bark bark");
    }
}
