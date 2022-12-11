package lab7;

import java.util.Scanner;

public class TextUserInterface {
    private Scanner reader;
    private Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }

    public void start() {
        System.out.println("Statement: ");
        System.out.println("  add - add a new word");
        System.out.println("  translate - translate existing word");
        System.out.println("  quit - quit the user interface");
        while (true) {
            System.out.println("Statement: ");
            String command = this.reader.nextLine();
            if (command.equals("quit")) {
                System.out.println("Cheers!");
                break;
            }
            else if(command.equals("add")){
                System.out.println("In finnish: ");
                String word=this.reader.nextLine();
                System.out.println("translation: ");
                String translation=this.reader.nextLine();
                this.dictionary.add(word, translation);
            } 
            else if(command.equals("translate")){
                System.out.println("Give a word: ");
                String word=this.reader.nextLine();
                System.out.println("Translation: " + this.dictionary.translate(word));
                
            }
            else {
                System.out.println("Unknown statement.");
            }
        }
    }
}
