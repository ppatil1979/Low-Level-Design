package designPatterns.prototype;

public class Client {

    private static final ProtypeRegistry registry = new ProtypeRegistry();
    public static void main(String[] args) {

        fillPrototypeRegistry();
        Student septLLMBatch2025 = registry.getPrototype("Student",Student.class);
        Student clonedStudent = septLLMBatch2025.clone();
        clonedStudent.setName("Pradip");
        clonedStudent.setAge(24);
        // Now clonedStudent is a copy of septLLMBatch2025
        InternationalStudent septLLMInternationalBatch2025 = registry.getPrototype("InternationalStudent",InternationalStudent.class);
        InternationalStudent clonedInternationalStudent = septLLMInternationalBatch2025.clone();
        clonedInternationalStudent.setName("Alice");
        clonedInternationalStudent.setAge(23);

        
    }

    public static void fillPrototypeRegistry() {
        
        registry.registerPrototype("Student", new Student("SeptLLMBatch2025", 85));

        registry.registerPrototype("InternationalStudent", new InternationalStudent("SeptLLMBatch2025", 90, "Canada"));
    }
    
}
