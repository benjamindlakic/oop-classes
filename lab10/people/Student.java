package people;

public class Student extends Person {
	
	private int credits;

	public Student(String name, String address) {
		super(name, address);
		this.credits = 0;
	}
	
	public void study() {
		this.credits++;
	}
	
	public int credits() {
		return this.credits;
	}
	
	
	public void print() {
	    System.out.print(getName() + "\n" +  "  " + getAddress());
	    }
	
	public String toString() {
		return this.getName() + "\n" + "  " + this.getAddress() + "\n" + "  " + "credits " + this.credits();
	}
	

}
