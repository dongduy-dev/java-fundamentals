package OOP.StudentManagement;

public class Student {
    private String id;
    private String fullName;
    private Date birthDate;
    private float gpa;
    private DaClass daClass;

    public Student(String id, String fullName, Date birthDate, float gpa, DaClass daClass) {
        this.id = id;
        this.fullName = fullName;
        this.birthDate = birthDate;
        this.gpa = gpa;
        this.daClass = daClass;
    }

    public String getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public float getGpa() {
        return gpa;
    }

    public DaClass getDaClass() {
        return daClass;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public void setDaClass(DaClass daClass) {
        this.daClass = daClass;
    }

    @Override
    public String toString() {
        return "Student[" +
                "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", birthDate=" + birthDate +
                ", gpa=" + gpa +
                ", daClass=" + daClass +
                ']';
    }

    public String getFacultyName(){
        return daClass.getFaculty();
    }

    public boolean isPassed(){
        return (gpa > 5.0);
    }

    public boolean checkBirtDate(Student s){
        return birthDate.equals(s.getBirthDate());
    }
}