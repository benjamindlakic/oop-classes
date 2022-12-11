package lab7;

import java.util.HashMap;

public class PromissoryNote {
    private HashMap<String, Double> notes;
    public PromissoryNote(){
        this.notes= new HashMap<>();
    }
    public void setLoan(String toWhom, double value){
        this.notes.put(toWhom, value);
    }
    public double howMuchIsTheDebt(String whose){
        if(this.notes.get(whose)!=null){
            return this.notes.get(whose);
        }
        return 0d;
    }
}
