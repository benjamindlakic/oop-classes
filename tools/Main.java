package tools;

public class Main {
    public static void main(String[] args) {
        DuplicateRemover remover= new PersonalDuplicateRemover();

        remover.add("first");
        remover.add("second");
        remover.add("first");

        System.out.println("Duplicates: "+ remover.getNumberOfDetectedDuplicates());

        remover.add("last");
        remover.add("last");
        remover.add("new");

        System.out.println("Duplicates: "+ remover.getNumberOfDetectedDuplicates());

        System.out.println("Unique: " + remover.getUniqueCharacterStrings());

        remover.empty();

        System.out.println("Duplicates: "+ remover.getNumberOfDetectedDuplicates());

        System.out.println("Unique: " + remover.getUniqueCharacterStrings());
    }
}
