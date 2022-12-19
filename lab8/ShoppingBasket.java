package lab8;

import java.util.HashMap;
import java.util.Map;

public class ShoppingBasket {
    private Map<String, Purchase> basket;
    public ShoppingBasket(){
        this.basket=new HashMap<>();
    }
    public void add(String product, int price){
        if(basket.containsKey(product)){
            this.basket.get(product).increaseAmount();
        }
        else{
            Purchase newPurchase=new Purchase(product, 1, price);
            this.basket.put(product, newPurchase);
        }
        
        
    }
    public int price(){
        int totalPrice=0;
        
        for(Purchase p: this.basket.values()){
            totalPrice+=p.price();
        }
        return totalPrice;
    }
    public void print(){
        for(Purchase p : basket.values()){
            System.out.println(p);
        }
    }
}
