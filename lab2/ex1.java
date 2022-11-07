package lab2;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
    
        Scanner reader = new Scanner(System.in);
        String secret="secret";
        while(true){
            System.out.println("Type password:");
            String password = reader.nextLine();
            if(password.equals(secret)){
            System.out.println("You are right");
            break;
            }
        }
    }
}