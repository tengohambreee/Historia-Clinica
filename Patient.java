import java.util.*;

public class Patient {
    private String fullName;
    private int id;
    private Date birthDate;
    private boolean gender;
    private double weight;
    private double height;
    private String homeAddress;
    private List<MedicalImage> medicalImages;
    private List<MedicalCondition> medicalConditions;
    public List<MedicalCondition> getMedicalConditions() {
    return medicalConditions;
}


    public Patient(String fullName, int id, Date birthDate, boolean gender, double weight, double height, String homeAddress) {
        this.fullName = fullName;
        this.id = id;
        this.birthDate = birthDate;
        this.gender = gender;
        this.weight = weight;
        this.height = height;
        this.homeAddress = homeAddress;
        this.medicalImages = new ArrayList<>();
        this.medicalConditions = new ArrayList<>();
    }

    public String getFullName() { return fullName; }
    public int getId() { return id; }
    public Date getBirthDate() { return birthDate; }
    public boolean getGender() { return gender; }
    public double getWeight() { return weight; }
    public double getHeight() { return height; }
    public String getHomeAddress() { return homeAddress; }

    public void addMedicalImage(MedicalImage image) { medicalImages.add(image); }
    public void removeMedicalImage(MedicalImage image) { medicalImages.remove(image); }
    public void addMedicalCondition(MedicalCondition condition) { medicalConditions.add(condition); }
    public void removeMedicalCondition(MedicalCondition condition) { medicalConditions.remove(condition); }
}
