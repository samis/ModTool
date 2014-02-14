package in.cloudns.companion.ModTool.core;

public abstract class Object {
    private String name;
    protected int cost;

    public Object() { super(); }
    public Object(String name, int cost) {
	this.name = name;
	this.cost = cost;
    }

    public abstract int getCost();

    public String getName() {
	return name;
    }

    public void setCost(int cost) {
	this.cost = cost;
    }

    public void setName(String name) {
	this.name = name;
    }

}
