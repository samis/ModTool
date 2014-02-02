package in.cloudns.companion.ModTool.core;

public class Item {
    // This class represents an Item in the data that has no crafting recipe.
    private String name;
    private int cost;

    /**
     * @return the name of the item
     */
    public String getName() {
	return name;
    }

    /**
     * @param name the item's name
     */
    public void setName(String name) {
	this.name = name;
    }

    /**
     * @return the cost
     */
    public int getCost() {
	return cost;
    }

    /**
     * @param cost the cost to set
     */
    public void setCost(int cost) {
	this.cost = cost;
    }

}
