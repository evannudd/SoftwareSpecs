
public class ColoradoBlueSpruce extends Tree {
	private double COST = 20;
	
	private String description = "A pricey blue spruce from Colorado decorated with "; 

	public Double getCost() {
		return COST; // will be appended by the decorators. 
	}
	
	public String getDescription()
	{
		return description; 
	} 
}
