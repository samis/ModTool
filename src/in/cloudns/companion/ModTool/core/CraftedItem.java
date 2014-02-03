package in.cloudns.companion.ModTool.core;

public class CraftedItem extends Item implements Craftable {
    private Item[][] crafting_recipe = new Item[2][2];

    /* (non-Javadoc)
     * @see in.cloudns.companion.ModTool.core.Craftable#getCrafting_recipe()
     */
    @Override
    public Item[][] getCrafting_recipe() {
	return crafting_recipe;
    }

    /* (non-Javadoc)
     * @see in.cloudns.companion.ModTool.core.Craftable#setCrafting_recipe(in.cloudns.companion.ModTool.core.Item[][])
     */
    @Override
    public void setCrafting_recipe(Item[][] crafting_recipe) {
	this.crafting_recipe = crafting_recipe;
    }

    public CraftedItem(String name, int cost, Item[][] crafting_recipe) {
	super(name, cost);
	this.crafting_recipe = crafting_recipe;
    }

    @Override
    public int getCost() {
	int current_cost = 0;
	for (Item[] current_row : crafting_recipe) {
	    for (Item current_item : current_row) {
		current_cost += current_item.getCost();
	    }
	}
	return current_cost;
    }

}
