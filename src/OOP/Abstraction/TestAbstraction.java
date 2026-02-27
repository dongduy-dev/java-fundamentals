package OOP.Abstraction;

public class TestAbstraction {
    public static void main(String[] args) {
        Coords c1 = new Coords(2,3);
        Coords c2 = new Coords(6,3);


        Rectangle r1 = new Rectangle(c1, 2, 3);
        Circle cr1 = new Circle(c2, 3);

        System.out.println(r1.calculateArea());
        System.out.println(r1.calculatePerimeter());

        System.out.println(cr1.calculateArea());
        System.out.println(cr1.calculatePerimeter());

    }
}
