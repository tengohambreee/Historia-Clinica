import java.util.Date;

public class MedicalCondition {
    private String conditionName;
    private Date diagnosisDate;
    private String prescribedTreatment;

    public MedicalCondition(String conditionName, Date diagnosisDate, String prescribedTreatment) {
        this.conditionName = conditionName;
        this.diagnosisDate = diagnosisDate;
        this.prescribedTreatment = prescribedTreatment;
    }

    public String getConditionName() { return conditionName; }
    public Date getDiagnosisDate() { return diagnosisDate; }
    public String getPrescribedTreatment() { return prescribedTreatment; }
}
