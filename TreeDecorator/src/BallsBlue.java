
public class BallsBlue extends TreeDecorator {
	
	private double COST = 2;
	
	private String description = "some sparkley blue balls, ";
	
	protected Tree beautifulTree; 
	
	public BallsBlue(Tree myTree) {
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
