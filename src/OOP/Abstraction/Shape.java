package OOP.Abstraction;

public abstract class Shape {
    protected Coords coords;

    public Shape(Coords coords) {
        this.coords = coords;
    }

    public Coords getCoords() {
        return coords;
    }
    public void setCoords(Coords coords) {
        this.coords = coords;
    }

    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}
