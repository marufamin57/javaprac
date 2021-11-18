package hospital_management_system;

public class Patient extends User {
	private long PatientId;
	private boolean insured;
	public long getPatientId() {
		return PatientId;
	}
	public void setPatientId(long patientId) {
		PatientId = patientId;
	}
	public boolean isInsured() {
		return insured;
	}
	public void setInsured(boolean insured) {
		this.insured = insured;
	}
}
