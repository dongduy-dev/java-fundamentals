package OOP.Abstraction;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(Coords coords, double length, double width) {
        super(coords);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return (length + width) * 2.0;
    }
}
