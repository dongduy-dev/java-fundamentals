import java.util.Scanner;

public class CheckEvenNumber {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("enter x: ");
            int x = sc.nextInt();

            if(x%2==0){
                System.out.println("even");
            }
            else{
                System.out.println("odd");
            }
        }
    }
}
