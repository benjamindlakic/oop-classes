package lab9.analysis;

import java.io.File;


public class Main {
    public static void main(String[] args) {
        File file=new File("C:/Users/benjo/OneDrive/Documents/JAVATASK/testFile.txt");
        Analysis analysis=new Analysis(file);
        System.out.println("Lines: "+ analysis.lines());
        System.out.println("Characters: "+ analysis.characters());
    }

}
