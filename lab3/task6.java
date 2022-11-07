package lab3;

import java.util.ArrayList;
import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        ArrayList<String> words=new ArrayList<String>();
        Scanner reader=new Scanner(System.in);
        int i=0;
        while(true){
            String word=reader.nextLine();
            if(words.contains(word)){
                System.out.println("Already entered that word.");
                break;
            }
            else{
                words.add(word);
            }
        }
    }
}
