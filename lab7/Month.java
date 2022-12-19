package lab7;

import java.util.HashMap;

public class Month {
    private int monthNumber;
    private String monthName;
    private HashMap<Integer, String> months=MapMonths.months();

    public Month(int monthNumber){
        this.monthNumber=monthNumber;
        this.monthName=this.mapMonth(monthNumber);
    }
    
    public Month(String shortMonth){
        this.monthNumber=(int) this.mapMonth(shortMonth).keySet().toArray()[0];
        this.monthName=(String) this.mapMonth(shortMonth).values().toArray()[0];
    }

    @Override
    public String toString() {
        return "Month [monthNumber=" + monthNumber + ", monthName=" + monthName + "]";
    }

    private String mapMonth(int monthNumber){
        return this.months.get(monthNumber);
    }
    private HashMap<Integer, String> mapMonth(String shortMonth){
        HashMap<Integer, String> result = new HashMap<>();
        for(int i : this.months.keySet()){
            if(this.months.get(i).toLowerCase().contains(shortMonth.toLowerCase())){
                result.put(i, this.months.get(i));
                return result;
            }
        }
        return null;    
    }
    public String getMonthForShort(){
        return this.monthName.substring(0, 3);
    }
    public int getMonthNumber(){
        return this.monthNumber;
    }
    public Month getNextMonth(){
        if(this.monthNumber+1 <= 12) return new Month(this.monthNumber + 1);
        return new Month(1);
    }

}
