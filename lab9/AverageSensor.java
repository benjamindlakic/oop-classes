package lab9;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor{
    private List<Sensor> listSensors;
    private List<Integer> readings;

    public AverageSensor(){
        this.listSensors= new ArrayList<>();
        this.readings=new ArrayList<>();

    }

    @Override
    public boolean isOn() {
        for(int i=0; i<listSensors.size(); i++){
            if(listSensors.get(i).isOn()!=true){
                return false;
            }
        }
        return true;
    }

    @Override
    public void on() {
        for(int i=0; i<listSensors.size(); i++){
            listSensors.get(i).on();
        }
    }

    @Override
    public void off() {
        for(int i=0; i<listSensors.size(); i++){
            listSensors.get(i).off();
        }
        
    }

    @Override
    public int measure() {
        int sum=0;
        for(int i=0; i<listSensors.size(); i++){
            if(listSensors.get(i).isOn()==false){
                throw new IllegalStateException();
            }
            else{
                sum=sum+listSensors.get(i).measure();
            }
        }
        int average=Math.round(sum/listSensors.size());
        this.readings.add(average);
        return average;
    }
    
    public void addSensor(Sensor additional){
        listSensors.add(additional);
    }

    public List<Integer> readings(){
        return readings;
    }
}
