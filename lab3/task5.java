package lab3;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner reader= new Scanner(System.in);
        String first=reader.nextLine();
        String second=reader.nextLine();
        if(first.indexOf(second) > 0){
            System.out.println(second);
        }
        else{
            System.out.println("It doesnt.");
        }
    }
}
