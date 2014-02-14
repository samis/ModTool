package in.cloudns.companion.ModTool.core;

public class CostCalculator {
    public static int calculateCost(Object[][] items) {
	int cost = 0;
	for (Object[] current_row : items) {
	    for (Object current_item : current_row) {
		cost += current_item.getCost();
	    }
	}
	return cost;
	
    }

}
