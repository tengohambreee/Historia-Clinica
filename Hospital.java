import java.util.*;

public class Hospital {
    private List<Patient> patientRecords;

    public Hospital() {
        this.patientRecords = new ArrayList<>();
    }

    public Patient findPatientById(int id) {
        for (Patient patient : patientRecords) {
            if (patient.getId() == id) {
                return patient;
            }
        }
        return null;
    }

    public List<String> getTallestPatientsHeights() {
        double maxHeight = 0;
        List<String> tallestPatients = new ArrayList<>();
        for (Patient patient : patientRecords) {
            if (patient.getHeight() > maxHeight) {
                maxHeight = patient.getHeight();
                tallestPatients.clear();
                tallestPatients.add(String.valueOf(patient.getHeight()));
            } else if (patient.getHeight() == maxHeight) {
                tallestPatients.add(String.valueOf(patient.getHeight()));
            }
        }
        return tallestPatients;
    }

    public int countFemalePatientsWithDengue() {
        int count = 0;
        for (Patient patient : patientRecords) {
            if (!patient.getGender()) { // Assuming false = female
                for (MedicalCondition condition : patient.getMedicalConditions()) {
                    if (condition.getConditionName().equalsIgnoreCase("Dengue")) {
                        count++;
                        break;
                    }
                }
            }
        }
        return count;
    }

    public List<Patient> sortPatientsByName() {
        List<Patient> sortedList = new ArrayList<>(patientRecords);
        sortedList.sort(Comparator.comparing(Patient::getFullName));
        return sortedList;
    }

    public List<Patient> sortPatientsByWeight() {
        List<Patient> sortedList = new ArrayList<>(patientRecords);
        sortedList.sort(Comparator.comparingDouble(Patient::getWeight));
        return sortedList;
    }

    public void addPatient(Patient patient) { patientRecords.add(patient); }
    public void removePatient(Patient patient) { patientRecords.remove(patient); }
}
