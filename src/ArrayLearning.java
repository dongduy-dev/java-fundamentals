import java.util.Scanner;

public class ArrayLearning {
    public static void main(String[] args) {
        int[] numbers;
        numbers = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < numbers.length; i++){
            System.out.print("Enter number " + (i+1) + ": ");
            numbers[i] = sc.nextInt();
        }
        for(int j : numbers){
            System.out.println(j);
        }
        double[] sothuc;
        sothuc = new double[] {1.0,2.0,3.0,4.0,5.0};
        for(double k : sothuc){
            System.out.println(k);
        }
    }
}
