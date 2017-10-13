
public class Star extends TreeDecorator {
	
	private double COST = 10;
	
	private String description = "a lovely shiny star, ";
	
	protected Tree beautifulTree; 
	
	public Star(Tree myTree) {
		super(myTree);
		
		if(myTree.getDescription().indexOf("star") > 0) // search for substring
		{
			System.out.println("Tree already has a star!");
			description = ""; // a good hack, eh? 
			COST = 0; 
		}	// because there can only be one star.
		
	}

	public Double getCost() {
		return super.getCost() + COST;
	}
	
	public String getDescription()
	{
		return super.getDescription() + description; 
	} 
}
