
public class BalsamFir extends Tree {
	private double COST = 5;
	
	private String description = "A simple balsam fir decorated with "; 

	public Double getCost() {
		return COST; // will be appended by the decorators. 
	}
	
	public String getDescription()
	{
		return description; 
	} 
}
