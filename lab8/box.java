package lab8;

import java.util.ArrayList;

public class box {
    private ArrayList<ToBeStored> things;
    private double maximunWeight;

    public box(double maximunWeight){
        this.things=new ArrayList<>();
        this.maximunWeight=maximunWeight;
    }

    public void add(ToBeStored thing){
        if((this.totalWeight() + thing.weight())>this.maximunWeight){
            System.out.println("BOX IS FULL.");
        }else{
            this.things.add(thing);
        }
    }
    public double totalWeight(){
        double total=0;
        for(ToBeStored toBeStored: things){
            total+=toBeStored.weight();
        }
        return total;
    }
    public String toString(){
        return "Number of things " + this.things.size() + " total weight " + totalWeight();
    }
}
