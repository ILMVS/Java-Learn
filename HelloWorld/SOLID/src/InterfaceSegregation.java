public class InterfaceSegregation {
    public static void main(String[] args) {

    }
}
//this interface has many responsibilities of a doctor, which violates the Interface Segregation Principle.
//interface DoctorInterface {
//    // Patient care
//    void checkPatient();
//    void diagnose();
//    void prescribeMedication();
//    void performSurgery();
//    void monitorRecovery();
//    void requestLabTests();
//    void interpretLabResults();
//    void provideFollowUpCare();
//
//    // Administrative tasks
//    void fillMedicalRecords();
//    void approveInsuranceClaims();
//    void scheduleAppointments();
//    void manageStaff();
//    void attendMeetings();
//
//    // Research activities
//    void conductClinicalTrials();
//    void publishResearch();
//    void reviewMedicalLiterature();
//    void presentAtConferences();
//
//    // Teaching responsibilities
//    void teachMedicalStudents();
//    void superviseResidents();
//    void prepareLectures();
//    void gradeExams();
//
//    // Communication
//    void communicateWithFamily();
//    void consultWithColleagues();
//    void providePatientEducation();
//    void handlePatientComplaints();
//
//    // Emergency duties
//    void respondToEmergencies();
//    void performCPR();
//    void triagePatients();
//}

//Solution: Split the DoctorInterface into smaller, more specific interfaces.

// PatientCare.java
interface PatientCare {
    void checkPatient();
    void diagnose();
    void prescribeMedication();
    void performSurgery();
    void monitorRecovery();
    void requestLabTests();
    void interpretLabResults();
    void provideFollowUpCare();
}

// Administration.java
interface Administration {
    void fillMedicalRecords();
    void approveInsuranceClaims();
    void scheduleAppointments();
    void manageStaff();
    void attendMeetings();
}

// Research.java
interface Research {
    void conductClinicalTrials();
    void publishResearch();
    void reviewMedicalLiterature();
    void presentAtConferences();
}

// Teaching.java
interface Teaching {
    void teachMedicalStudents();
    void superviseResidents();
    void prepareLectures();
    void gradeExams();
}

// Communication.java
interface Communication {
    void communicateWithFamily();
    void consultWithColleagues();
    void providePatientEducation();
    void handlePatientComplaints();
}

// EmergencyDuty.java
interface EmergencyDuty {
    void respondToEmergencies();
    void performCPR();
    void triagePatients();
}

// Example implementation for a Surgeon
class Surgeon implements PatientCare, EmergencyDuty, Communication {
    @Override
    public void checkPatient() { System.out.println("Surgeon checking patient."); }
    @Override
    public void diagnose() { System.out.println("Surgeon diagnosing."); }
    @Override
    public void prescribeMedication() { System.out.println("Surgeon prescribing medication."); }
    @Override
    public void performSurgery() { System.out.println("Surgeon performing surgery."); }
    @Override
    public void monitorRecovery() { System.out.println("Surgeon monitoring recovery."); }
    @Override
    public void requestLabTests() { System.out.println("Surgeon requesting lab tests."); }
    @Override
    public void interpretLabResults() { System.out.println("Surgeon interpreting lab results."); }
    @Override
    public void provideFollowUpCare() { System.out.println("Surgeon providing follow-up care."); }
    @Override
    public void respondToEmergencies() { System.out.println("Surgeon responding to emergency."); }
    @Override
    public void performCPR() { System.out.println("Surgeon performing CPR."); }
    @Override
    public void triagePatients() { System.out.println("Surgeon triaging patients."); }
    @Override
    public void communicateWithFamily() { System.out.println("Surgeon communicating with family."); }
    @Override
    public void consultWithColleagues() { System.out.println("Surgeon consulting with colleagues."); }
    @Override
    public void providePatientEducation() { System.out.println("Surgeon providing patient education."); }
    @Override
    public void handlePatientComplaints() { System.out.println("Surgeon handling patient complaints."); }
}

// Example implementation for a Medical Researcher
class MedicalResearcher implements Research, Teaching {
    @Override
    public void conductClinicalTrials() { System.out.println("Researcher conducting clinical trials."); }
    @Override
    public void publishResearch() { System.out.println("Researcher publishing research."); }
    @Override
    public void reviewMedicalLiterature() { System.out.println("Researcher reviewing literature."); }
    @Override
    public void presentAtConferences() { System.out.println("Researcher presenting at conferences."); }
    @Override
    public void teachMedicalStudents() { System.out.println("Researcher teaching students."); }
    @Override
    public void superviseResidents() { System.out.println("Researcher supervising residents."); }
    @Override
    public void prepareLectures() { System.out.println("Researcher preparing lectures."); }
    @Override
    public void gradeExams() { System.out.println("Researcher grading exams."); }
}

//the segregation will allow us to create more specific classes that implement only the interfaces they need.