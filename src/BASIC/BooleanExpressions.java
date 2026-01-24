import java.util.*;
public class BooleanExpressions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        String result = (a%2==0)?"even":"odd";
        System.out.println(result);
    }
}
