package OOP;

public class MyDate {
    private int day, month, year;
//    private int month;
//    private int year;

    public MyDate(int d, int m, int y){
        this.day = d;
        this.month = m;
        this.year = y;
    }

    public void printDate(){
        System.out.printf("%d/%d/%d\n", this.day, this.month, this.year);
//        System.out.printf("%d/%d/%d\n", day, month, year); okay!
    }

    public void printDay(){
        System.out.printf("%d\n", this.day);
    }

    public void printMonth(){
        System.out.printf("%d\n", this.month);
    }

    public void printYear(){
        System.out.printf("%d\n", this.year);
    }
}
