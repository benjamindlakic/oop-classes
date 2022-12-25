package lab9;

import java.util.Random;

public class Thermometer implements Sensor{
    private boolean isOn;
    public Thermometer(){
        this.isOn=true;
    }
    @Override
    public boolean isOn() {
        return isOn;
    }

    @Override
    public void on() {
        this.isOn=true;
    }

    @Override
    public void off() {
        this.isOn=false;
    }

    @Override
    public int measure() {
        if(this.isOn==true){
            Random rand= new Random();
            int random_integer = rand.nextInt(30-(-30)) + (-30);
            return random_integer;
        }else{
            throw new IllegalStateException();
        }
    }
    
}
