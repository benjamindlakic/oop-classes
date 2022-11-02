package lab3;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        String name=reader.nextLine();
        for(int i=0; i<name.length(); i++){
            System.out.println((i+1)+" character "+ name.charAt(i));
        }
    }
}
