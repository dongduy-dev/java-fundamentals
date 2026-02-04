package OOP.StudentManagement;

public class DaClass {
    private String name, faculty;

    public DaClass(String name, String faculty) {
        this.name = name;
        this.faculty = faculty;
    }

    public String getName() {
        return name;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return name + " - " + faculty;
    }
}
