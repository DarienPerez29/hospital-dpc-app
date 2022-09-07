package hospitaldpc.elements;

public class Patient {

    private int idPatient;
    private String name;
    private String lastName;
    private char sex;
    private String maritalStatus;
    private Date bDate;
    private String address;
    private String phone;
    private String email;
    private Double height;
    private Double weight;
    private int temperature;
    private int oximetry;
    private String desc;

    public Patient() {
        this.idPatient = 0;
        this.name = "N/A";
        this.lastName = "N/A";
        this.sex = ' ';
        this.maritalStatus = "N/A";
        this.bDate = new Date();
        this.address = "N/A";
        this.phone = "N/A";
        this.email = "N/A";
        this.height = 0.0;
        this.weight = 0.0;
        this.temperature = 0;
        this.oximetry = 0;
        this.desc = "N/A";
    }//end constructor sin parámetros

    public Patient(int idPatient, String name, String lastName, char sex,
            String maritalStatus, String address, String phone, String email,
            Double height, Double weight, int temperature, int oximetry, String desc) {
        this.idPatient = idPatient;
        this.name = name;
        this.lastName = lastName;
        this.sex = sex;
        this.maritalStatus = maritalStatus;
        this.bDate = new Date();
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.height = height;
        this.weight = weight;
        this.temperature = temperature;
        this.oximetry = oximetry;
        this.desc = desc;
    }//end constructor con parámetros primarios   

    public Patient(int idPatient, String name, String lastName, char sex,
            String maritalStatus, Date bDate, String address, String phone,
            String email, Double height, Double weight, int temperature,
            int oximetry, String desc) {
        this.idPatient = idPatient;
        this.name = name;
        this.lastName = lastName;
        this.sex = sex;
        this.maritalStatus = maritalStatus;
        this.bDate = bDate;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.height = height;
        this.weight = weight;
        this.temperature = temperature;
        this.oximetry = oximetry;
        this.desc = desc;
    }//end constructor con parámetros finales

    //SETTERS
    public void setIdPatient(int idPatient) {
        this.idPatient = idPatient;
    }//end setIdPatient

    public void setName(String name) {
        this.name = name;
    }//end setName

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }//end setLastName

    public void setSex(char sex) {
        this.sex = sex;
    }//end setSex

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }//end setMaritalStatus

    public void setBirthDateByBar(String bDate) {
        String[] dateSection = bDate.split("-");
        int day = Integer.parseInt(dateSection[2]);
        int month = Integer.parseInt(dateSection[1]);
        int year = Integer.parseInt(dateSection[0]);
        this.bDate = new Date(day, month, year);
    }//end setBirthDateByBar

    public void setAddress(String address) {
        this.address = address;
    }//end setAddress

    public void setPhone(String phone) {
        this.phone = phone;
    }//end setPhone

    public void setEmail(String email) {
        this.email = email;
    }//end setEmail

    public void setHeight(Double height) {
        this.height = height;
    }//end setHeight

    public void setWeight(Double weight) {
        this.weight = weight;
    }//end setWeight

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }//end setTemperature

    public void setOximetry(int oximetry) {
        this.oximetry = oximetry;
    }//end setOximetry

    public void setDesc(String desc) {
        this.desc = desc;
    }//end setDesc

    //GETTERS
    public int getIdPatient() {
        return idPatient;
    }//end getIdPatient

    public String getName() {
        return name;
    }//end getName

    public String getLastName() {
        return lastName;
    }//end getLastName

    public char getSex() {
        return sex;
    }//end getSex

    public String getMaritalStatus() {
        return maritalStatus;
    }//end getMaritalStatus

    public Date getbDate() {
        return bDate;
    }//end getbDate

    public String getAddress() {
        return address;
    }//end getAddress

    public String getPhone() {
        return phone;
    }//end getPhone

    public String getEmail() {
        return email;
    }//end getEmail

    public Double getHeight() {
        return height;
    }//end getHeight

    public Double getWeight() {
        return weight;
    }//end getWeight

    public int getTemperature() {
        return temperature;
    }//end getTemperature

    public int getOximetry() {
        return oximetry;
    }//end getOximetry

    public String getDesc() {
        return desc;
    }//end getDesc

    @Override
    public String toString() {
        return this.idPatient + "\n"
                + this.name + "\n"
                + this.lastName + "\n"
                + this.sex + "\n"
                + this.maritalStatus + "\n"
                + this.bDate.toString() + "\n"
                + this.address + "\n"
                + this.phone + "\n"
                + this.email + "\n"
                + this.height + "\n"
                + this.weight + "\n"
                + this.temperature + "\n"
                + this.oximetry + "\n"
                + this.desc;
    }//end toString

}//end class
