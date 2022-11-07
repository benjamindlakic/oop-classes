import java.util.Scanner;

import java.util.;

public class TasksLab1 {

    public static void main(String[] args) {
        System.out.println("Jane Doe"); // task 1
        System.out.println("HelloWorld");
        System.out.println("to all the other people"); // task 2

        int year=365;
        int secsinDay=86400;
        int result= yearsecsinDay;

        System.out.println("There are " + result + " seconds in a year"); // task 3

        Scanner sc= new Scanner(System.in); // task 4
        System.out.print("Enter first number: ");
        int a=sc.nextInt();
        System.out.print("Enter second number: ");
        int b=sc.nextInt();
        int c=a+b;
        System.out.println("Sum of the numbers: " + c);

        System.out.print("Type a number: "); // task 5
        int number=sc.nextInt();
        if  (number>0){
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is negative.");
        }

         System.out.print("Enter first number: "); // task 6
         int n1=sc.nextInt();
         System.out.print("Enter second number: ");
         int n2=sc.nextInt();
         if(n1>n2){
            System.out.println("Greater number: " + n1);
         } else if(n1<n2){
            System.out.println("Greater number: " + n2);
         } else {
            System.out.println("They are equal.");
         }
    }



}