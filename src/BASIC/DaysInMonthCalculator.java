import java.util.Scanner;

public class DaysInMonthCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month: ");
        int month = sc.nextInt();

        System.out.print("Enter year: ");
        int year = sc.nextInt();

//        switch (month) {
//            case 1:
//            case 3:
//            case 5:
//            case 7:
//            case 8:
//            case 10:
//            case 12:
//                System.out.print("31 days");
//                break;
//            case 4:
//            case 6:
//            case 9:
//            case 11:
//                System.out.print("30 days");
//                break;
//            case 2: {
//                if (year % 100 == 0) {
//                    if (year % 400 == 0) {
//                        System.out.print("29 days");
//                    }
//                    else{
//                        System.out.print("28 days");
//                    }
//                }
//                else {
//                    if(year % 4 == 0){
//                        System.out.print("29 days");
//                    }
//                    else{
//                        System.out.print("28 days");
//                    }
//                }
                //better approachif

//                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
//                    System.out.print("29 days");
//                }
//                else {
//                    System.out.print("28 days");
//                }
//                break;
//        }
        // best approach
//        boolean isLeapYear = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
//        System.out.print(isLeapYear ? "29 days" : "28 days");
        switch  (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.print("31 days");
            case 4, 6, 9, 11 -> System.out.print("30 days");
            case 2 -> {
                boolean isLeap = ((year % 400 == 0) || (year % 4 ==0 && year % 100 != 0));
                System.out.print(isLeap? "29 days" : "28 days");
            }
            default -> throw new IllegalArgumentException("Invalid month: " + month);
        }
    }
}

//static int daysInMonth(int year, int month) {
//    return switch (month) {
//        case 1, 3, 5, 7, 8, 10, 12 -> 31;
//        case 4, 6, 9, 11 -> 30;
//        case 2 -> ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) ? 29 : 28;
//        default -> throw new IllegalArgumentException("Invalid month: " + month);
//    };
//}