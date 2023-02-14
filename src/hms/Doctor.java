package hms;
import java.util.ArrayList;
public class Doctor extends Person {
    private String specialization;

    public ArrayList<Patient> getPatients() {
        return patients;
    }

    private ArrayList<Patient> patients;
    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
        this.patients = new ArrayList<>();
    }

    public Doctor(){

    }
    public String prescribeMedicine(Patient patient) {
        return "Doctor " + name + " has prescribed medicine for Patient " + patient.getName()+" with patient ID: "+patient.getId();
    }

    public String checkReport(Patient patient) {
        return "Doctor " + name + " has checked the report for Patient " + patient.getName()+" with patient ID: "+patient.getId();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}

