package hospitaldpc.queries;

import hospitaldpc.elements.User;
import hospitaldpc.lists.UsersList;
import hospitaldpc.tools.Connector;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserQueries {

    private final Connector CONNECTION;
    private final String TABLE;

    public UserQueries() {
        this.CONNECTION = new Connector();
        this.TABLE = "usuario";
    }//end constructor

    //------------- MÉTODOS BÁSICOS -------------------
    public UsersList selectWhere(String where) throws ClassNotFoundException, SQLException {
        UsersList dataList = new UsersList();
        this.CONNECTION.createConnection();

        String queryStatement = "SELECT * FROM " + this.TABLE + " WHERE " + where;
        Statement queryExe = this.CONNECTION.getConnection().createStatement();
        ResultSet result = queryExe.executeQuery(queryStatement);

        while (result.next()) {
            int idUser = result.getInt("IdUsuario");
            String name = result.getString("Nombre");
            String lastName = result.getString("Apellidos");
            String username = result.getString("NombreUsuario");
            String email = result.getString("Email");
            String pass = result.getString("Password");

            User currentUser = new User(idUser, name, lastName, username, email, pass);
            dataList.addUser(currentUser);
        }//end while obtener datos consulta
        
        this.CONNECTION.getConnection().close();
        
        if(dataList.sizeUserList() <= 0){
            User noUser = new User();
            dataList.addUser(noUser);
        }//end if no usuario
        
        return dataList;
    }//end selectWhere
    
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
}//end class
