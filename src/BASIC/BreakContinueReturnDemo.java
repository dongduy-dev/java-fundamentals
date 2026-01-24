public class BreakContinueReturnDemo {
    public static void main(String[] args) {
//        outer:for (int i = 1; i <= 10; i++) {
//
//            for(int j=1;j<=2;j++){
//                for (int k = 1; k <= 10; k++) {
//                    if(k == 5 ){
//                        break outer;
//                    }
//                    System.out.println("k " + k);
//                }
//            }
//            System.out.println("i " + i);
//        }
         for(int i=2;i<=10;i++){

            System.out.println("===Bang cuu chuong " + i + "===");
            for (int j=1;j<=9;j++){
                if(i <= 5 ) continue ;
                System.out.println(i + " x " + j + " = " + i*j);
            }
            System.out.println();
        }
    }
}
