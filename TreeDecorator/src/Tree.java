
public abstract class Tree {
	private String description;
	private Double cost;

	public String getDescription() {
		return description;
	}

	public Double getCost() {
		return cost;
	}
	
	public void printAllTreeInfo()
	{
		System.out.println(getDescription() + " - It cost us a whopping $" + getCost().toString() + "."); 
	}
}
