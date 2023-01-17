package people;

public class Person {
	private String name;
	private String address;
	
	public Person(String name, String address) {
		this.setName(name);
		this.setAddress(address);
	}
	
	public String toString() {
		return this.getName() + "\n" + " " + this.getAddress();
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
