package learnermanagement;

public class Trainer extends Person {
    private String specialization;

    // Default Constructor
    public Trainer(){
    }

    // Parameterized Constructor
    public Trainer(int id, String firstName, String lastName,
                   String email, String specialization) {

        super(id, firstName, lastName, email);
        this.specialization = specialization;
    }

    // Getter
    public String getSpecialization() {
        return specialization;
    }

    // Setter
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    // Method Overriding
    @Override
    public String getDisplayName() {
        return super.getDisplayName() + " | Trainer";
    }

    @Override
    public String toString() {
        return "Trainer{" +
                "id=" + getId() +
                ", name='" + getDisplayName() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", specialization='" + specialization + '\'' +
                '}';
    }
}
