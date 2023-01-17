package farmsimulator;

import java.util.Random;

public class Cow implements Milkable, Alive {
	
	private String name;
	private double udderCapacity;
	private double amount;
	 private static final String[] NAMES = new String[]{
	   "Anu", "Arpa", "Essi", "Heluna", "Hely",  "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",  "Jaana", "Jami", "Jatta", "Laku", "Liekki",  "Mainikki", "Mella", "Mimmi", "Naatti", "Nina", "Nyytti", "Papu",
		   "Pullukka", "Pulu", "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};
	 
	 private String randomName() {
	        String genName = NAMES[new Random().nextInt(31)];
	        return genName;
	    }

	 private double randomUdderCap() {
	        double capGen = 15 + new Random().nextInt(26);
	        return capGen;
	    }
	    
	public Cow() {
		this.name=this.randomName();
		this.udderCapacity=this.randomUdderCap();
	}
	
	public Cow(String name) {
		this.name=name;
		this.udderCapacity=this.randomUdderCap();
	}
	
	String getName() {
		return this.name;
	}
	
	double getCapacity() {
		 return this.udderCapacity;
	}
	
	double getAmount() {
		return this.amount;
	}
	
	public String toString() {
		 return name + " " + Math.ceil(this.amount) + "/" + Math.ceil(this.udderCapacity);
	}

	@Override
	public void liveHour() {
		 double min = 0.7;
	        double max = 2.0;
	        double milkProduced = min + (max - min) * new Random().nextDouble();
	        double tempCheckExceed = this.amount + Math.ceil(milkProduced);
	        if (this.udderCapacity >= tempCheckExceed) {
	            this.amount += Math.ceil(milkProduced);
	        }
	}

	@Override
	public double milk() {
		 double milk = this.amount;
	     this.amount = 0.0;
	     return milk;
	}
	
	
}
