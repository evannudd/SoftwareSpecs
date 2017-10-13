
public class TreeDecorator extends Tree {
	protected final Tree finalTree;
	
	public TreeDecorator(Tree tree)
	{
		this.finalTree = tree; 
	}
	
	public Double getCost() {
		return finalTree.getCost();
	}
	
	public String getDescription()
	{
		return finalTree.getDescription(); 
	} 

}
