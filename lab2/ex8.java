package lab2;

import java.util.Random;
import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        int number = drawNumber();
        int countguess=0;
        Scanner reader= new Scanner(System.in);
        while(true){
            System.out.print("Guess");
            int guess=reader.nextInt();
            countguess++;
            if (guess>number){
                System.out.println("The number is lesser, guesses made " + countguess);
            }
            else if(guess<number){
                System.out.println("The number is greater, guesses made " + countguess);
            }
            else{
                System.out.println("Perfect.");
            }
        }
    }
    private static int drawNumber() {
        Random rand = new Random();
        int number=rand.nextInt(101);
        return number;
        
    }
}
