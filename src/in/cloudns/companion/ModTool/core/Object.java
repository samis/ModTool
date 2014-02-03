package in.cloudns.companion.ModTool.core;

public abstract class Object {
    private String name;
    protected int cost;

    public Object(String name, int cost) {
	this.name = name;
	this.cost = cost;
    }
    public Object() { super(); }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public abstract int getCost();

    public void setCost(int cost) {
	this.cost = cost;
    }

}
