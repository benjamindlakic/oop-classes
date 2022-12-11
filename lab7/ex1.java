package lab7;

import java.util.HashMap;

public class ex1 {
    public static void main(String[] args) {
        HashMap<String,String> people= new HashMap<>();

        people.put("matti", "mage");
        people.put("mikael", "mixu");
        people.put("arto", "arppa");
        
        System.out.println("matti: "+ people.get("matti"));
    }
}
