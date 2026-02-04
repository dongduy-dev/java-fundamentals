package OOP.StudentManagement;

public class StudentManagement {
    public static void main(String[] args) {
        Date date1 = new Date(33,13,2000);
        Date date2 = new Date(15,6,2004);

        DaClass class1 = new DaClass("CS", "IT");
        DaClass class2 = new DaClass("ART", "LA");

        Student s1 = new Student("art2226156", "Hatomugi", date2, 9.8f, class2);
        Student s2 = new Student("cs2226256", "Akki", date1, 4.8f, class1);
        System.out.println(date1);
        System.out.println(s1);
        System.out.println(s1.getFacultyName());
        System.out.println(s1.isPassed());
        System.out.println(s1.checkBirtDate(s2));
    }
}
