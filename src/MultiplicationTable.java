public class MultiplicationTable {
    public static void main(String[] args) {
//        int n, i, j;
//
//        Scanner sc = new Scanner(System.in);
//        n = sc.nextInt();
//        for (i = 1; i <= 10; i++) {
//            System.out.println(n + " x " + i + " = " + n * i);
//        }
        int i, j;
        for (i = 2; i <= 9; i++) {
            System.out.println("------Bang cuu chuong " + i + " -----");
            for (j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + i * j);
            }
            System.out.println();
        }

    }
}
