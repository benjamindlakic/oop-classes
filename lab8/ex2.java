package lab8;

public class ex2 {
    public static void main(String[] args) {
        box box=new box(5);

        Book book1= new Book("Writer 1", "Name 1", 1);
        Book book2= new Book("Writer 2", "Name 2", 2);
        Book book3= new Book("Writer 3", "Name 3", 3);

        box.add(book1);
        box.add(book2);
        box.add(book3);

        CD cd1 = new CD("Artist 1", "Title ", 1973);
        CD cd2 = new CD("Artist 2", "Title ", 1953);
        CD cd3 = new CD("Artist 3", "Title ", 1993);

        box.add(cd1);
        box.add(cd2);
        box.add(cd3);

        System.out.println(box);
    }
}
