package OOP;

import java.util.Objects;

public class MyDateV2{
    private int day;
    private int month;
    private int year;

    public MyDateV2(int d, int m, int y){
        if(d >= 1 && d <= 31){
            this.day = d;
        }
        else{
            this.day = 1;
        }

        if(m >= 1 && m <= 12){
            this.month = m;
        }
        else{
            this.month = 1;
        }

        if(y > 0){
            this.year = y;
        }
        else{
            this.year = 1;
        }
    }

    public int getDay(){
        return this.day;
    }

    public void setDay(int d){
        if(d >= 1 && d <= 31){
            this.day = d;
        }
    }


    public int getMonth(){
        return this.month;
    }

    public void setMonth(int m){
        if(m >= 1 && m <= 12){
            this.month = m;
        }
    }


    public int getYear(){
        return this.year;
    }

    public void setYear(int y){
        if(y > 0){
            this.year = y;
        }
    }

    @Override
    public String toString() {
        return "MyDateV2{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
    public String toString2(){
        return "";
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof MyDateV2 myDateV2)) return false;
        return day == myDateV2.day && month == myDateV2.month && year == myDateV2.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, month, year);
    }
}