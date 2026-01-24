/*
*Practice
 */
import java.util.Scanner;
public class QFC_Practice {
    private static final double EPS = 1e-9;

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out .println("enter a: ");
            double a = sc.nextDouble();
            System.out.println("enter b: ");
            double b = sc.nextDouble();
            System.out.println("enter c: ");
            double c = sc.nextDouble();
            solveEquation(a,b,c);
        }
    }

    private static void solveEquation(double a, double b, double c) {
        if(Math.abs(a) < EPS){
            solveLinear(b,c);
            return;
        }
        double delta = b*b - 4*a*c;
        if(delta < -EPS){
            System.out.println("nO SOLUTION");
        }
        else if(Math.abs(delta) < EPS){
            double x = -b / (2.0 * a);
            System.out.printf("one double root x1 = x2 = %.6f%n", x);
        }
        else{
            double sqrtDelta = Math.sqrt(delta);
            double x1 = (-b + sqrtDelta) / (2.0 * a);
            double x2 = (-b - sqrtDelta) / (2.0 * a);

            System.out.println("two distinct root");
            System.out.printf(" x1 = %.6f%n", x1);
            System.out.printf(" x2 = %.6f%n", x2);
        }
    }


    private static void solveLinear(double b, double c) {
        if(Math.abs(b) < EPS){
            if(Math.abs(c) < EPS){
                System.out.println("Inf solution");
            }
            else{
                System.out.println("no solution");
            }
            return;
        }
        double x = -c/b;
        System.out.printf("x = %.6f%n", x);
    }
}