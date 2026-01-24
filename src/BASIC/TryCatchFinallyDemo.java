import java.util.Scanner;

public class TryCatchFinallyDemo {
    public static void main(String[] args) {
        int n = 0;
//        Scanner sc =new Scanner(System.in);
//        try{
//            System.out.print("Enter a number: ");
//            n = sc.nextInt();
//        }finally{
//            sc.close();
//        }
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            n = sc.nextInt();
        }catch(Exception e){
            System.out.print("Enter a number dude!");
        }
        System.out.println(n);
    }
}
