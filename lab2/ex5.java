package lab2;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Type a number:");
        int number=sc.nextInt();

        int x=0;
        int result=0;
        while(x<=number){
            result+=(int) Math.pow(2, x);
            x++;
        }
        System.out.println("The result is " + result);
    }
}
