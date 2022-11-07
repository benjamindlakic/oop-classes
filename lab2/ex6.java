package lab2;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("How many times should text print?");
        int x=reader.nextInt();
        int i=1;
        while(i<=x){
            printText();
            i++;
        }
    }
    public static void printText() {
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }
}
