package lab9.analysis;

import java.io.File;
import java.net.Socket;

public class Main {
    public static void main(String[] args) {
        File file=new File("");
        Analysis analysis=new Analysis(file);
        System.out.println("Lines: "+ analysis.lines());
        System.out.println("Characters: "+ analysis.characters());
    }
    

}
