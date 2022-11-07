package lab2;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int sum=0;
        int read;

        System.out.println("input first number");
        read = Integer.parseInt(reader.nextLine());

        sum += read;

        System.out.println("input second number");
        read = Integer.parseInt(reader.nextLine());

        sum += read;

        System.out.println("input third number");
        read = Integer.parseInt(reader.nextLine());

        sum += read;
        System.out.println(sum);

    }
}
