
public class Lights extends TreeDecorator {
	
	private double COST = 5;
	
	private String description = "some strobing lights, ";
	
	protected Tree beautifulTree; 
	
	public Lights(Tree myTree) {
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
