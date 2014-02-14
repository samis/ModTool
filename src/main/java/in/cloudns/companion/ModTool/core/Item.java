package in.cloudns.companion.ModTool.core;

public class Item extends Object {
    // This class represents an Item in the data that has no crafting recipe.

    public Item() {
	super("No Item", 0);
    }

    public Item(String name, int cost) {
	super(name, cost);
    }

    /**
     * @return the cost
     */
    public int getCost() {
	return cost;
    }

}
