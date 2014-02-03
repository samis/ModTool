package in.cloudns.companion.ModTool.core;

public class CraftedItem extends Item implements Craftable {
    private Object[][] crafting_recipe = new Item[2][2];

    /* (non-Javadoc)
     * @see in.cloudns.companion.ModTool.core.Craftable#getCrafting_recipe()
     */
    @Override
    public Object[][] getCrafting_recipe() {
	return crafting_recipe;
    }

    /* (non-Javadoc)
     * @see in.cloudns.companion.ModTool.core.Craftable#setCrafting_recipe(in.cloudns.companion.ModTool.core.Item[][])
     */
    @Override
    public void setCrafting_recipe(Object[][] crafting_recipe) {
	this.crafting_recipe = crafting_recipe;
    }

    public CraftedItem(String name, int cost, Object[][] crafting_recipe) {
	super(name, cost);
	this.crafting_recipe = crafting_recipe;
    }

    @Override
    public int getCost() {
	return CostCalculator.calculateCost(crafting_recipe);
    }

}
