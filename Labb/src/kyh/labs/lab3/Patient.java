package kyh.labs.lab3;

public class Patient {
    String name;
    String sickness;
    String medicine;
    public Patient (String name, String Sickness) {
        this.name = name;
        this.sickness = sickness;
    }

    public fetchCorrectMedication (String s) {
        this.medicine = medicine;
    }

    public String getName(String) {
        return name;
    }

    public String getSickness(){
        return sickness;
    }

    public String takeMedication(String){
        this.medicine = medicine;
        return medicine;
    }

    public boolean isSick() {
       return true;
    }
}
