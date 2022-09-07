package hospitaldpc.elements;

public class User {
    private int idUsuario;
    private String nombre;
    private String apellidos;
    private String nombreUsuario;
    private String email;
    private String password;

    public User() {
        this.idUsuario = 0;
        this.nombre = "N/A";
        this.apellidos = "N/A";
        this.nombreUsuario = "N/A";
        this.email = "N/A";
        this.password = "N/A";
    }//end constructor sin parámetros

    public User(int idUsuario, String nombre, String apellidos, 
            String nombreUsuario, String email, String password) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nombreUsuario = nombreUsuario;
        this.email = email;
        this.password = password;
    }//end constructor con parámetros
    
    //SETTERS    
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }//end setIdUsuario

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }//end setNombre

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }//end setApellidos

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }//end setNombreUsuario

    public void setEmail(String email) {
        this.email = email;
    }//end setEmail

    public void setPassword(String password) {
        this.password = password;
    }//end setPassword
    
    
    //GETTERS
    public int getIdUsuario() {
        return idUsuario;
    }//end getIdUsuario

    public String getNombre() {
        return nombre;
    }//end getNombre

    public String getApellidos() {
        return apellidos;
    }//end getApellidos

    public String getNombreUsuario() {
        return nombreUsuario;
    }//end getNombreUsuario

    public String getEmail() {
        return email;
    }//end getEmail

    public String getPassword() {
        return password;
    }//end getPassword
    
}//end class
