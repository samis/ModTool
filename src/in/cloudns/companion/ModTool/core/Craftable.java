package in.cloudns.companion.ModTool.core;

public interface Craftable {

    public abstract Item[][] getCrafting_recipe();

    public abstract void setCrafting_recipe(Item[][] crafting_recipe);

}