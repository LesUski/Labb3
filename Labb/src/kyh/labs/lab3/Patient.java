package kyh.labs.lab3;

public class Patient {
    private String name;
    private String sickness;
    private String medicine;
    boolean isSick = false;

    //Constructor
    public Patient (String name, String Sickness) {
        this.name = name;
        this.sickness = sickness;

    }
    Patient patient = new Patient(name, sickness);

    //Constructor
    public Patient (String medicine) {
        ;
    }
    //Method 1
    public String getName() {
        return name;
    }
    //Method 2
    public String getSickness(){
        return sickness;
    }
    //Method 3
    public String takeMedication(String medicine){
        this.medicine = medicine;
        return medicine;
    }
    //Method 4
    public boolean isSick() {
       if (sickness != null) {
           isSick = true;}
       else {
           isSick = false;
       }
       return isSick;
       }
    }
}
