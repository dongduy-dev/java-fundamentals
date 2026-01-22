import java.util.Scanner;

public class DecimalToBinaryConverter {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int decimal = sc.nextInt();
        StringBuilder binary = new StringBuilder();
        while (decimal > 0) {
            binary.append(decimal % 2);
            decimal = decimal / 2;
        }
        System.out.println(binary.reverse());
//        String binary = "";
//        while(decimal > 0){
//            binary = (decimal % 2) + binary;
//            decimal = decimal / 2;
//        }
//        System.out.println(binary);

        sc.close();
    }
}
