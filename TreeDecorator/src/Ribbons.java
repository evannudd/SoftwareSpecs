
public class Ribbons extends TreeDecorator {
	
	private double COST = 2;
	
	private String description = "some curly ribbons, ";
	
	protected Tree beautifulTree; 
	
	public Ribbons(Tree myTree) {
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
