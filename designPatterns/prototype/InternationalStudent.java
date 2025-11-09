package designPatterns.prototype;

public class InternationalStudent extends Student {

    private String country;

    public InternationalStudent() {
        // Default constructor
    }

    public InternationalStudent(String batch, int psp, String country) {
        super(batch, psp);
        this.country = country;
    }

    public InternationalStudent(InternationalStudent student) {
        super(student);
        this.country = student.country;
    }

    @Override
    public InternationalStudent clone() {
        return new InternationalStudent(this);
    }
    
}
