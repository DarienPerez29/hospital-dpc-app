package hospitaldpc.lists;

import hospitaldpc.elements.Patient;
import java.util.ArrayList;

public class PatientsList {

    private ArrayList<Patient> patients;

    public PatientsList() {
        this.patients = new ArrayList<>();
    }//end constructor

    public void addPatient(Patient patient) {
        this.patients.add(patient);
    }//end addPatient

    public Patient getPatient(int index) {
        return this.patients.get(index);
    }//end getPatient

    public int sizePatientList() {
        return this.patients.size();
    }//end sizePatientList

}//end class
