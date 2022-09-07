package hospitaldpc.managers;

import hospitaldpc.elements.User;
import hospitaldpc.queries.UserQueries;
import java.sql.SQLException;

public class UsersManager {
    private UserQueries queries;
    
    public UsersManager() {
        this.queries = new UserQueries();
    }//end constructor
    
    public int createUser(String[] data) throws ClassNotFoundException, SQLException {
        return this.queries.insert(data);
    }//end createPatient
    
    public String[] selectPassByUserameOrEmail(String credential) throws ClassNotFoundException, SQLException {
        User currentUser = this.queries.selectWhere("NombreUsuario='" + credential + "' OR Email='" + credential + "';").getUser(0);
        
        String[] data = new String[6];
        
        data[0] = Integer.toString(currentUser.getIdUsuario());
        data[1] = currentUser.getNombre();
        data[2] = currentUser.getApellidos();
        data[3] = currentUser.getNombreUsuario();
        data[4] = currentUser.getEmail();
        data[5] = currentUser.getPassword();
        
        return data;
    }//end selectPassByUsernameOrEmail

}//end class
