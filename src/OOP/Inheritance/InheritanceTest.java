package OOP.Inheritance;

public class InheritanceTest {
    public static void main(String[] args) {
        Person p1 = new Person("Adam", 18, "Male");
        System.out.println(p1);

        Student s1 = new Student("1", "CS", "IT");
        System.out.println(s1);
        System.out.println(s1.getName());
        s1.eat();
        s1.study();
    }
}
