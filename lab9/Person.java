package lab9;

public class Person {
    public Person(String name, int age){
        if (name==null || name.equals("") || name.length() > 40){
            throw new IllegalArgumentException("The name is not valid.");
        }
        if (age < 0 || age > 120){
            throw new IllegalArgumentException("The age is not valid.");
        }
    }
}
