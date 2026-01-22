import java.util.*;
public class QuadraticFormulaCalculator_1401{
	private static final double EPS = 1e-9;
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			System.out.print("Enter a: ");
			double a = sc.nextDouble();

			System.out.print("Enter b: ");
			double b = sc.nextDouble();

			System.out.print("Enter c: ");
			double c = sc.nextDouble();
			
			SolveEquation(a, b, c);
		}
	}

	private static void SolveEquation(double a, double b, double c){
		if(a == 0){
			SolveLinear(b, c);
			return;
		}
		double delta = Math.pow(b, 2) - 4*a*c;
		if(delta < 0){
			System.out.println("No root");
		}
		else if(delta == 0){
			double x = (-b) / (2*a);
			System.out.printf("double root: x= %.2f", x);
		}
		else{
			double sqrtDelta = Math.sqrt(delta);
			double x1 = (-b + sqrtDelta) / (2*a);
			double x2 = (-b - sqrtDelta) / (2*a);
			System.out.println("double root");
			System.out.printf("x1= %.2f%n", x1);
			System.out.printf("x2= %.2f%n", x2);
		}
	}

	private static void SolveLinear(double b, double c){
		if(b == 0){
            System.out.println("it's in");
			if(c == 0){
				System.out.println("infinity solution");
			}
			else{
				System.out.println("No solution");
			}
            return;
		}
		double x = -c/b;
		System.out.printf("x= %.2f", x);
	}
}












