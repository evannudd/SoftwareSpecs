
public class FraserFir extends Tree {
	private double COST = 12;
	
	private String description = "A wonderful Fraser Fir decorated with "; 

	public Double getCost() {
		return COST; // will be appended by the decorators. 
	}
	
	public String getDescription()
	{
		return description; 
	} 
}
