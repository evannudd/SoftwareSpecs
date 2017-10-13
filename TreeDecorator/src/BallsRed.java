
public class BallsRed extends TreeDecorator {
	private double COST = 1;
	
	private String description = "some shiny red balls, ";
	
	protected Tree beautifulTree; 
	
	public BallsRed(Tree myTree) {
		super(myTree);
	}

	public Double getCost() {
		return super.getCost() + COST;
	}
	
	public String getDescription()
	{
		return super.getDescription() + description; 
	} 
}
