package hospitaldpc.elements;

public class Date {

    private int day;
    private int month;
    private int year;

    public Date() {
        this.day = 0;
        this.month = 0;
        this.year = 0;
    }//end constructor sin parámetros

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }//end constructor todos los parámetros

    //SETTERS
    public void setDay(int day) {
        this.day = day;
    }//end setDay

    public void setMonth(int month) {
        this.month = month;
    }//end setMonth

    public void setYear(int year) {
        this.year = year;
    }//end setYear
    
    //GETTERS

    public int getDay() {
        return day;
    }//end getDay

    public int getMonth() {
        return month;
    }//end getMonth

    public int getYear() {
        return year;
    }//end getYear
    
    
    /*
    //SETTERS
    public void setDia(int dia) {
        this.day = dia;
    }//end setDia

    public void setMes(int mes) {
        this.month = mes;
    }//end setMes

    public void setAnio(int anio) {
        this.year = anio;
    }//end setAnio

    //GETTERS
    public int getDia() {
        return day;
    }//end getDia

    public int getMes() {
        return month;
    }//end getMes

    public int getAnio() {
        return year;
    }//end getAnio

*/

    @Override
    public String toString() {
        return this.year + "-" + this.month + "-" + this.day;
    }//end toString

}//end class
