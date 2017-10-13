public class BallsSilver extends TreeDecorator {
	private double COST = 3;
	
	private String description = "some fancy silver balls, ";
	
	protected Tree beautifulTree; 
	
	public BallsSilver(Tree myTree) {
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
