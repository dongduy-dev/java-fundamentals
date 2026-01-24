import java.util.Scanner;

public class MathClassLearning {
    public static void main(String[] args) {
//        int a = 2;
//        int b = 4;
//        int c = 10;
//        System.out.println("abs: " + Math.abs(a));
//        System.out.println("max2: " + Math.max(a,b));
////        System.out.println("max3: " + Math.max(a, b, c));
//        System.out.println("Dien tich hcn: " + Chu_vhi_chu_nhat(a,b));
        double r, chuvi, dientich;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ban kinh r= ");
        r = sc.nextDouble();

        System.out.println("chu vi= " + Math.round(Chu_vi_tron(r)));
        double dientichlamtron = dien_tich_tron(r);
        System.out.println("dien tich= " + Math.round(dientichlamtron*100.0)/100.0);

    }

    private static double Chu_vhi_chu_nhat(double a, double b) {
        return (a+b)*2;
    }

    private static double Chu_vi_tron(double r) {
        return 2*Math.PI*r;
    }

    private static double dien_tich_tron(double r) {
        return Math.PI*r*r;
    }
}
