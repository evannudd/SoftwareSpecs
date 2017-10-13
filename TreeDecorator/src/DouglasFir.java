
public class DouglasFir extends Tree {
	private double COST = 15.0;
	
	private String description = "A sturdy douglas fir decorated with "; 

	public Double getCost() {
		return COST; // will be appended by the decorators. 
	}
	
	public String getDescription()
	{
		return description; 
	} 
}
