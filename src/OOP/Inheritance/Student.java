package OOP.Inheritance;

public class Student  extends Person{
    private String id, major, faculty;

    public Student(String name, int age, String gender, String id, String major, String faculty) {
        super(name, age, gender);
        this.id = id;
        this.major = major;
        this.faculty = faculty;
    }

    public Student(String id, String major, String faculty) {
//        super();
        this.id = id;
        this.major = major;
        this.faculty = faculty;
    }

    public String getId() {
        return id;
    }

    public String getMajor() {
        return major;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return "Student[" +
                "id='" + id + '\'' +
                ", major='" + major + '\'' +
                ", faculty='" + faculty + '\'' +
                ']';
    }

    //STUDENT METHODS
    public void study(){
        System.out.println("Student is studying");
    }
}
