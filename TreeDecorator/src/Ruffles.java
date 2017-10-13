
public class Ruffles extends TreeDecorator {
	
	private double COST = 1;
	
	private String description = "some lacey ruffles, ";
	
	protected Tree beautifulTree; 
	
	public Ruffles(Tree myTree) {
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
