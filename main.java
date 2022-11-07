import java.util.Scanner;

/**
 * main
 */
public class main {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int first=Integer.parseInt(reader.nextLine());
        int second=Integer.parseInt(reader.nextLine());
        int i=first;
        if(second>first){
            while(i<=second){
                if(i%2==1){
                    System.out.println(i);
                }
                i++;
            }
        }
        
    }
}
