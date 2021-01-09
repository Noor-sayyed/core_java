package day6.bean;

public class Patient {
	private int patientId;
    private String patientName;
    private String sufferingDisease;

    public Patient()
    {

    }
    public Patient(int patientId, String patientName, String sufferingDisease) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.sufferingDisease = sufferingDisease;
    }
    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getSufferingDisease() {
        return sufferingDisease;
    }

    public void setSufferingDisease(String sufferingDisease) {
        this.sufferingDisease = sufferingDisease;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "patientId=" + patientId +
                ", patientName='" + patientName + '\'' +
                ", sufferingDisease='" + sufferingDisease + '\'' +
                '}';
    }

}
