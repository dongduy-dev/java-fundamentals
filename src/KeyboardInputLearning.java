/**
 * @author DongDuy
 */
import java.util.*;
public class KeyboardInputLearning {
    public static void main(String[] args) {
        System.out.print("=====Quadratic Formula Calculator=====");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        float a = sc.nextInt();

        System.out.print("Enter b: ");
        float b = sc.nextInt();

        System.out.print("Enter c: ");
        float c = sc.nextInt();

        float delta;
        delta = b*b - 4*a*c;

        if(delta<0){
            System.out.print("PT vo nghiem");
        } else if (delta == 0) {
            System.out.print("PT co nghiem kep x1 = x2 = " + -b/2*a);
        }
        else{
            System.out.print("PT co 2 nghiem phan biet x1 = " + (-b + Math.sqrt(delta))/2*a);
            System.out.print(" x2 = " + (-b - Math.sqrt(delta))/2*a);
        }
    }
}
