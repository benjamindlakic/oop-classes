package lab6;

public class task1_part2 {
    public static void main(String[] args) {
        Library library = new Library();

        Book cheese = new Book("Cheese Problems Solved", "Woodhead Publishing", 2007);
        library.addBook(cheese);

        Book nhl = new Book("NHL Hockey", "Stanley Kupp", 1952);
        library.addBook(nhl);

        library.addBook(new Book("Battle Axes", "Tom A. Hawk", 1851));

        library.printBooks();
    }
}
