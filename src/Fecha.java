public class Fecha {
    int month;
    int day;
    int year;
    //Constructor
    public Fecha(){
    }
    public Fecha(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    //Metodos
    public String mostrarFecha(int month, int day, int year){
        this.month=month;
        this.day=day;
        this.year=year;
        return month+"/"+day+"/"+year;
    }

    //Setter
    public void setMonth(int month) {
        this.month = month;
    }
    public void setDay(int day){
        this.day = day;
    }
    public void setYear(int year){
        this.year = year;
    }
    //Getter
    public int getYear(){
        return year;
    }
    public int getMonth(){
        return month;
    }
    public int getDay(){
        return day;
    }
}
