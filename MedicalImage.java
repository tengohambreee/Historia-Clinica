import java.util.Date;

public class MedicalImage {
    private String fileName;
    private Date dateCaptured;
    private String imageType;
    private String doctorNotes;

    public MedicalImage(String fileName, Date dateCaptured, String imageType, String doctorNotes) {
        this.fileName = fileName;
        this.dateCaptured = dateCaptured;
        this.imageType = imageType;
        this.doctorNotes = doctorNotes;
    }

    public String getFileName() { return fileName; }
    public Date getDateCaptured() { return dateCaptured; }
    public String getImageType() { return imageType; }
    public String getDoctorNotes() { return doctorNotes; }
}
