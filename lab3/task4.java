package lab3;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        String name=reader.nextLine();
        String reverse="";
        for (int i = (name.length()-1); i >= 0; i--) {
            reverse+= name.charAt(i);
        }
        System.out.println(reverse);
    }
}
