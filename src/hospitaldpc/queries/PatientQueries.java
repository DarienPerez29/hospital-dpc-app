package hospitaldpc.queries;

import hospitaldpc.elements.Patient;
import hospitaldpc.lists.PatientsList;
import hospitaldpc.tools.Connector;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PatientQueries {

    private final Connector CONNECTION;
    private final String TABLE;

    public PatientQueries() {
        this.CONNECTION = new Connector();
        this.TABLE = "paciente";
    }//end constructor

    //----------------------------- MÉTODOS BÁSICOS ------------------------------
    public PatientsList selectAll() throws ClassNotFoundException, SQLException {
        PatientsList dataList = new PatientsList();
        this.CONNECTION.createConnection();

        String queryStatement = "SELECT * FROM " + this.TABLE;
        Statement queryExe = this.CONNECTION.getConnection().createStatement();
        ResultSet result = queryExe.executeQuery(queryStatement);

        while (result.next()) {
            int idPatient = result.getInt("IdPaciente");
            String name = result.getString("Nombre");
            String lastName = result.getString("Apellidos");
            char sex = result.getString("Sexo").charAt(0);
            String maritalStatus = result.getString("EstadoMarital");
            String bDate = result.getString("FechaNacimiento");
            String address = result.getString("Direccion");
            String phone = result.getString("Telefono");
            String email = result.getString("Email");
            Double height = result.getDouble("AlturaCm");
            Double weight = result.getDouble("PesoKg");
            int temperature = result.getInt("Temperatura");
            int oximetry = result.getInt("Oximetria");
            String desc = result.getString("Descripcion");

            Patient currentPatient = new Patient(idPatient, name, lastName, sex, maritalStatus, address, phone, email, height, weight, temperature, oximetry, desc);
            currentPatient.setBirthDateByBar(bDate);
            dataList.addPatient(currentPatient);
        }//end while obtener datos consulta

        this.CONNECTION.getConnection().close();
        return dataList;
    }//end selectAll

    public int insert(String[] data) throws ClassNotFoundException, SQLException {
        int success;
        String valuesString = "";

        for (int i = 0; i < data.length; i++) {
            if (i == data.length - 1) {
                valuesString += "'" + data[i] + "'";
            }//end if ultimo elemento
            else {
                valuesString += "'" + data[i] + "', ";
            }//end if elemento intermedio
        }//end for cadena de valores

        this.CONNECTION.createConnection();
        String queryStatement = "INSERT INTO " + this.TABLE + " VALUES(NULL, " + valuesString + ");";
        Statement queryExe = this.CONNECTION.getConnection().createStatement();
        success = queryExe.executeUpdate(queryStatement);

        this.CONNECTION.getConnection().close();
        return success;
    }//end insert

    public int update(String[] data, int idPatient) throws ClassNotFoundException, SQLException {
        int success;
        this.CONNECTION.createConnection();
        String queryStatement = "UPDATE " + this.TABLE
                + " SET Nombre='" + data[0]
                + "', Apellidos='" + data[1]
                + "', Sexo='" + data[2]
                + "', EstadoMarital='" + data[3]
                + "', FechaNacimiento='" + data[4]
                + "', Direccion='" + data[5]
                + "', Telefono='" + data[6]
                + "', Email='" + data[7]
                + "', AlturaCm='" + data[8]
                + "', PesoKg='" + data[9]
                + "', Temperatura='" + data[10]
                + "', Oximetria='" + data[11]
                + "', Descripcion='" + data[12]
                + "' WHERE IdPaciente=" + idPatient + ";";

        Statement queryExe = this.CONNECTION.getConnection().createStatement();
        success = queryExe.executeUpdate(queryStatement);

        this.CONNECTION.getConnection().close();
        return success;
    }//end update

    public int delete(int idPatient) throws ClassNotFoundException, SQLException {
        int success;
        this.CONNECTION.createConnection();

        String queryStatement = "DELETE FROM " + this.TABLE + " WHERE IdPaciente=" + idPatient;

        Statement queryExe = this.CONNECTION.getConnection().createStatement();
        success = queryExe.executeUpdate(queryStatement);

        this.CONNECTION.getConnection().close();
        return success;
    }//end delete

    public PatientsList selectWhere(String where) throws ClassNotFoundException, SQLException {
        PatientsList dataList = new PatientsList();
        this.CONNECTION.createConnection();

        String queryStatement = "SELECT * FROM " + this.TABLE + " WHERE " + where;
        Statement queryExe = this.CONNECTION.getConnection().createStatement();
        ResultSet result = queryExe.executeQuery(queryStatement);

        while (result.next()) {
            int idPatient = result.getInt("IdPaciente");
            String name = result.getString("Nombre");
            String lastName = result.getString("Apellidos");
            char sex = result.getString("Sexo").charAt(0);
            String maritalStatus = result.getString("EstadoMarital");
            String bDate = result.getString("FechaNacimiento");
            String address = result.getString("Direccion");
            String phone = result.getString("Telefono");
            String email = result.getString("Email");
            Double height = result.getDouble("AlturaCm");
            Double weight = result.getDouble("PesoKg");
            int temperature = result.getInt("Temperatura");
            int oximetry = result.getInt("Oximetria");
            String desc = result.getString("Descripcion");

            Patient currentPatient = new Patient(idPatient, name, lastName, sex, maritalStatus, address, phone, email, height, weight, temperature, oximetry, desc);
            currentPatient.setBirthDateByBar(bDate);
            dataList.addPatient(currentPatient);
        }//end while obtener datos consulta

        this.CONNECTION.getConnection().close();
        return dataList;
    }//end selectWhere

}//end class
