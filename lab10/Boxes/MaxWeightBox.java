package Boxes;

import java.util.HashSet;
import java.util.Set;

public class MaxWeightBox {
	 private int maxWeight;
	    private Set<Thing> listThings;

	    public MaxWeightBox(int maxWeight) {
	        this.listThings = new HashSet<Thing>();
	        this.maxWeight = maxWeight;
	    }

	    private int getCurrentWeight() {
	        int boxWeight = 0;
	        for (Thing thing : listThings) {
	            boxWeight += thing.getWeight();
	        }
	        return boxWeight;
	    }

	    public void add(Thing thing) {
	        if (this.getCurrentWeight() + thing.getWeight() <= this.maxWeight) {
	            this.listThings.add(thing);
	        }
	    }

	    public boolean isInTheBox(Thing thing) {

	        for (Thing iThing : listThings) {
	            if (iThing.getName().equals(thing.getName())) {
	                return true;
	            }
	        }
	        
	        return false;
	    }
}
