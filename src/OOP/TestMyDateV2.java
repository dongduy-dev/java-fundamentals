package OOP;

public class TestMyDateV2{
    public static void main(String[] args){
        MyDateV2 md = new MyDateV2(35,61,-2);
        md.setDay(20);
        md.setMonth(2);
        md.setYear(2);
        System.out.println(md.getDay());
        System.out.println(md.getMonth());
        System.out.println(md.getYear());
    }
}