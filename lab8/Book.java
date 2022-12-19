package lab8;

public class Book implements ToBeStored{
    private String writer;
    private String name;
    private double weight;

    public Book(String writer, String name, double weight){
        this.writer=writer;
        this.name=name;
        this.weight=weight;
    }
    @Override
    public double weight() {
        // TODO Auto-generated method stub
        return 0;
    }
    @Override
    public String toString() {
        return "Book writer " + writer + ", title " + name + ", weight " + weight + ".";
    }
}
