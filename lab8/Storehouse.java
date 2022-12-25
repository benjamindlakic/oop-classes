package lab8;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Storehouse {
    private HashMap<String, Integer> productPrice;
    private HashMap<String, Integer> productStock;

    public Storehouse(){
        this.productPrice=new HashMap<>();
        this.productStock=new HashMap<>();
    }

    public void addProduct(String product, int price, int stock){
        this.productPrice.put(product, price);
        this.productStock.put(product, stock);
    }
    public int price(String product){
        return this.productPrice.get(product);
    }
    public int stock(String product){
        return this.productStock.get(product);
    }
    public boolean take(String product){
        if(this.productStock.getOrDefault(product, 0)>0){
            this.productStock.put(product, this.productStock.get(product)-1);
            return true;
        }
        else{
            return false;
        }
    }
    public Set<String> products(){
        Set<String> productSet = new HashSet<String>();
        for(String key: this.productStock.keySet()){
            productSet.add(key);
        }
        return productSet;
    }
}
