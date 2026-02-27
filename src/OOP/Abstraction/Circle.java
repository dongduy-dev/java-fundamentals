package OOP.Abstraction;

public class Circle extends Shape{
	private static final double PI = 3.141592653589793;
/*
private: ensuring that the value of PI is only accessible within the Circle class (Encapsulation).
static: Since pi is the same for every circle in the world, don't need a separate copy of it for every Circle object. It is stored once in memory for the whole class.
final: This makes it a constant. and cannot be changed later.
Convention: In Java, constants are always written in UPPERCASE with underscores between words (e.g., MAX_VALUE).
*/
	private double r;

	public Circle(Coords coords, double r){
		super(coords);
		this.r = r;
	}

	public double getR(){
		return r;
	}

	public void setR(double r){
		this.r = r;
	}

	@Override
	public double calculateArea(){
		return PI * r * r;
	}
	
	@Override
	public double calculatePerimeter(){
		return 2 * PI * r;
	}
}
