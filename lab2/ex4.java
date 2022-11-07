package lab2;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("First: ");
        int number1 = reader.nextInt();
        System.out.println("Second: ");
        int number2 = reader.nextInt();

        if (number1<=number2){
            int counter=1;
            while(counter<=number2){
                System.out.println(counter);
                counter++;
            }
        }
    }
}
