/**
 * Improved version of ReadFromKeyboard learning
 */
import java.util.Scanner;
public class QuadraticFormulaCalculator {
    private static final double EPS = 1e-9; // comparing variable (0) | Static bc this belongs to the class

    public static void main(String[] args) {
        System.out.println("===== Quadratic Formula Calculator =====");

        try (Scanner sc = new Scanner(System.in)) { // try statement is used to automatically close the Scanner, It is a resource-management feature
            System.out.println("Enter the a: ");
            double a = sc.nextDouble();

            System.out.println("Enter the b: ");
            double b = sc.nextDouble();

            System.out.println("Enter the c: ");
            double c = sc.nextDouble();

            solveEquation(a, b, c);
        }
    }

    private static void solveEquation(double a, double b, double c) {
        if (Math.abs(a) < EPS){
            solveLinear(b, c);
            return;
        }

        double delta = b * b - 4 * a * c;

        if (delta < -EPS) {
            System.out.println("No real roots");
        }

        else if (Math.abs(delta) < EPS){
            double x = -b / (2.0 * a);
            System.out.printf("one double root: x1 = x2 = %.6f%n", x);
        }

        else {
            double sqrtDelta = Math.sqrt(delta);
            double x1 = (-b + sqrtDelta) / (2.0 * a);
            double x2 = (-b - sqrtDelta) / (2.0 * a);

            System.out.println("two distinct real root");
            System.out.printf("x1 = %.6f%n", x1);
            System.out.printf("x2 = %.6f%n", x2);
        }
    }

    private static void solveLinear(double b, double c) {
        if (Math.abs(b) < EPS){
            if(Math.abs(c) < EPS){
                System.out.println("Inf solutions");
            }
            else {
                System.out.println("no solutions");
            }
            return;
        }
        double x = -c/b;
        System.out.printf("linear equation: x = %.6f%n", x);
    }
}
