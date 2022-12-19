package lab8;

public class Main {
    public static void main(String[] args) {
        Purchase purchase=new Purchase("milk", 4, 2);
        System.out.println("total price " + purchase.price());
        System.out.println(purchase);
        purchase.increaseAmount();
        System.out.println(purchase);
    }
}
