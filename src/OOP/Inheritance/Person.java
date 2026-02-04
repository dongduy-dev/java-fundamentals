package OOP.Inheritance;

public class Person {
    private String name;
    private int age;
    private String gender;

    public Person() {
        this.name = "DongDuy";
        this.age = 21;
        this.gender = "Male";
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        if(age >= 0){
            this.age = age;
        }
        else{
            this.age = 0;
        }
        if(gender.equals("Male") || gender.equals("Female")){
            this.gender = gender;
        }
        else{
            this.gender = "Female";
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if(age >= 0){
            this.age = age;
        }
    }

    public void setGender(String gender) {
        if(gender.equals("Male") || gender.equals("Female")){
            this.gender = gender;
        }
    }

    @Override
    public String toString() {
        return "Person[" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ']';
    }

    //PERSON METHODS
    public void eat(){
        System.out.println("Eating");
    }

    public void sleep(){
        System.out.println("Sleeping");
    }

    public void talk(){
        System.out.println("Talking");
    }
}
