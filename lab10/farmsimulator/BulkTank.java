package farmsimulator;

public class BulkTank {
	
	private double capacity;
	private double volume;

	
	public BulkTank() {
		this.capacity=2000;
		this.volume=0;
	}
	
	public BulkTank(double capacity) {
		this.capacity=capacity;
		this.volume=0;
	}
	
	public double getCapacity() {
		return this.capacity;
	}
	
	public double getVolume() {
		return this.volume;
	}
	
	public double howMuchFreeSpace() {
		return this.capacity-this.volume;
	}
	
	public void addToTank(double amount) {
		if (amount < 0) {
            return;
        }
		
		if(amount<=this.howMuchFreeSpace()) {
			this.volume+=amount;
		}else {
			this.volume=this.capacity;
		}
	}
	
	public double getFromTank(double amount) {
		if (amount < 0) {
            return 0.0;
        }
        
        if (amount > volume) {
            double everything = volume;
            volume = 0.0;
            return everything;
        }

        volume = volume - amount;
        return amount;
	}
	
	public String toString() {
		return Math.ceil(volume) + "/" + Math.ceil(capacity);
	}
}
