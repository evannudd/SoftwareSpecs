
public class LEDs extends TreeDecorator {
	private double COST = 10;
	
	private String description = "some obnoxious LEDs, ";
	
	protected Tree beautifulTree; 
	
	public LEDs(Tree myTree) {
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
