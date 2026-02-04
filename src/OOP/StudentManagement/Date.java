package OOP.StudentManagement;

import java.util.Objects;

public class Date {
    private int day, month, year;

    public Date(int day, int month, int year) {
        if(day >= 1 && day <= 31){
            this.day = day;
        }
        else{
            this.day = 1;
        }

        if(month >= 1 && month <= 12){
            this.month = month;
        }
        else{
            this.month = 1;
        }

        if(year > 0){
            this.year = year;
        }
        else{
            this.year = 1;
        }
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        if(day >= 1 && day <= 31) {
            this.day = day;
        }
    }

    public void setMonth(int month) {
        if(month >= 1 && month <= 12) {
            this.month = month;
        }
    }

    public void setYear(int year) {
        if(year > 0) {
            this.year = year;
        }
    }

    @Override
    public String toString(){
        return day + "/" + month + "/" + year;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Date date = (Date) o;
        return day == date.day && month == date.month && year == date.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, month, year);
    }
}
