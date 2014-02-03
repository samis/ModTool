package in.cloudns.companion.ModTool.core;

public class CraftedItem extends Item {
    private Item[][] crafting_recipe = new Item[2][2];

    public Item[][] getCrafting_recipe() {
	return crafting_recipe;
    }

    public void setCrafting_recipe(Item[][] crafting_recipe) {
	this.crafting_recipe = crafting_recipe;
    }

    public CraftedItem() {
	// TODO Auto-generated constructor stub
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
