package designPatterns.prototype;

public class Student implements Prototype<Student> {

    
    private String batch;
    private int psp;
    private String address;    
    private int gradeYear;
    private String name;
    private int age;

    // Getters and Setters
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
    
    public int getGradeYear() { return gradeYear; }
    public void setGradeYear(int gradeYear) { this.gradeYear = gradeYear; }
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public Student() {
        // Default constructor
    }

    public Student(String batch, int psp) {
        this.batch = batch;
        this.psp = psp;
       
    }

    public Student(Student student) {
        this.name = student.name;
        this.age = student.age;
        this.batch = student.batch;
        this.address = student.address;
        this.psp = student.psp;
        this.gradeYear = student.gradeYear;
    }

    @Override
    public Student clone() {
        return new Student(this);
    }
    
}
