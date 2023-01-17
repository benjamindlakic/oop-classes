package Boxes;

public class OneThingBox {
	private Thing thingSlot;

    public OneThingBox() {
        this.thingSlot = null;
    }

    @Override
    public void add(Thing thing) {
        if (thingSlot == null) {
            this.thingSlot = thing;
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {

        if (this.thingSlot != null && this.thingSlot.getName().equals(thing.getName())) {
            return true;
        }
        return false;
    }
}
