package hospitaldpc.managers;

import hospitaldpc.elements.Patient;
import hospitaldpc.lists.PatientsList;
import hospitaldpc.queries.PatientQueries;
import java.sql.SQLException;

public class PatientsManager {

    private PatientsList patientsTable;
    private PatientQueries queries;

    public PatientsManager() {
        this.patientsTable = new PatientsList();
        this.queries = new PatientQueries();
    }//end constructor

    public int createPatient(String[] data) throws ClassNotFoundException, SQLException {
        return this.queries.insert(data);
    }//end createPatient

    public String[][] readPatient() throws ClassNotFoundException, SQLException {
        this.patientsTable = this.queries.selectAll();
        String[][] patientList = new String[this.patientsTable.sizePatientList()][14];
        
        for (int i = 0; i < this.patientsTable.sizePatientList(); i++) {
            Patient currentPatient = this.patientsTable.getPatient(i);
            
            patientList[i][0] = Integer.toString(currentPatient.getIdPatient());
            patientList[i][1] = currentPatient.getName();
            patientList[i][2] = currentPatient.getLastName();
            patientList[i][3] = Character.toString(currentPatient.getSex());
            patientList[i][4] = currentPatient.getMaritalStatus();
            patientList[i][5] = currentPatient.getbDate().toString();
            patientList[i][6] = currentPatient.getAddress();
            patientList[i][7] = currentPatient.getPhone();
            patientList[i][8] = currentPatient.getEmail();
            patientList[i][9] = Double.toString(currentPatient.getHeight());
            patientList[i][10] = Double.toString(currentPatient.getWeight());
            patientList[i][11] = Integer.toString(currentPatient.getTemperature());
            patientList[i][12] = Integer.toString(currentPatient.getOximetry());
            patientList[i][13] = currentPatient.getDesc();
            
        }//end for llenar lista
        
        return patientList;
    }//end readPatient

    public String[] selectPatient(int idPatient) throws ClassNotFoundException, SQLException {
        Patient currentPatient = this.queries.selectWhere("IdPaciente = " + idPatient).getPatient(0);
        
        String[] data = new String[13];
        
        data[0] = currentPatient.getName();
        data[1] = currentPatient.getLastName();
        data[2] = Character.toString(currentPatient.getSex());
        data[3] = currentPatient.getMaritalStatus();
        data[4] = currentPatient.getbDate().toString();
        data[5] = currentPatient.getAddress();
        data[6] = currentPatient.getPhone();
        data[7] = currentPatient.getEmail();
        data[8] = Double.toString(currentPatient.getHeight());
        data[9] = Double.toString(currentPatient.getWeight());
        data[10] = Integer.toString(currentPatient.getTemperature());
        data[11] = Integer.toString(currentPatient.getOximetry());
        data[12] = currentPatient.getDesc();
        
        return data;
    }//end selectPatient

    public int updatePatient(String[] data, int idPatient) throws ClassNotFoundException, SQLException {
        return this.queries.update(data, idPatient);
    }//end createPatient

    public int deletePatient(int idPatient) throws ClassNotFoundException, SQLException {
        return this.queries.delete(idPatient);
    }//end deletePatient

}//end class
