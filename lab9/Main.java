package lab9;

public class Main {
    public static void main(String[] args) throws Exception{
       // UserInterface ui= new TextUserInterface();
       //  new ApplicationLogic(ui).execute(3);

       // Person person1 = new Person("Daj", 1000);

       Printer printer = new Printer("c:/Users/Azramon/Documents/java skola/textFile.txt");
       printer.printLinesWhichContain("tuo");
    }
}
