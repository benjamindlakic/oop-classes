package lab6;

public class Temperature {
    private double temperature;
    public Temperature(){

    }
    public void setTempKelvin(int newTemperature){
        this.temperature=newTemperature;
    }
    public void setTempFahrenheit(int newTemperature){
        double Celsius;
        Celsius=(5.0/9) * (newTemperature - 32);
        this.temperature=Celsius+273.15;
    }
    public void setTempCelsius(int newTemperature){
        this.temperature=newTemperature+273.15;
    }
    public double getTempKelvin(){
        return this.temperature;
    }
}
