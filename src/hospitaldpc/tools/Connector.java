package hospitaldpc.tools;

import java.sql.*;

public class Connector {

    private Connection CONNECTION;
    private final String USER;
    private final String PASSWORD;
    private final String URL;

    public Connector() {
        this.USER = "darien_test";
        this.PASSWORD = "darien_test";
        this.URL = "jdbc:mysql://localhost:3306/hospitaldpc_db" + "?serverTimezone=UTC";
        CONNECTION = null;
    }//end constructor

    public void createConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        this.CONNECTION = (java.sql.Connection) DriverManager.getConnection(URL, USER, PASSWORD);
    }//end createConnection

    public Connection getConnection() {
        return this.CONNECTION;
    }//end getConnection

}//end class
