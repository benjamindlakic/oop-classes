package lab9;

public class Main {
    public static void main(String[] args) {
        Sensor kumpola= new Thermometer(); 
        Sensor kaisenemi= new Thermometer();
        Sensor helsinkiVata= new Thermometer();

        AverageSensor helsinkiArea= new AverageSensor();
        helsinkiArea.addSensor(kumpola);
        helsinkiArea.addSensor(kaisenemi);
        helsinkiArea.addSensor(helsinkiVata);

        helsinkiArea.on();
        System.out.println("avg temp in helsinki is "+helsinkiArea.measure()+" degrees");
        System.out.println("avg temp in helsinki is "+helsinkiArea.measure()+" degrees");
        System.out.println("avg temp in helsinki is "+helsinkiArea.measure()+" degrees");

        System.out.println("readings : " + helsinkiArea.readings());
        
        
    }
}
