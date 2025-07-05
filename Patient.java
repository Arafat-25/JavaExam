//No.4b(i)

public class Patient {
    private String id;
    private String allergies;
    
    public Patient(String id, String allergies) {
        this.id = id;           // Resolves conflict between parameter
        this.allergies = allergies; // and instance variable
    }
}