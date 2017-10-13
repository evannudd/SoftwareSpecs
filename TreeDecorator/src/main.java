
public class main {

	public static void main(String[] args) {
		Tree myTree = new ColoradoBlueSpruce(); 
		
		myTree = new BallsBlue(myTree); 
		myTree = new BallsBlue(myTree); 
		myTree = new LEDs(myTree); 
		myTree = new Star(myTree);
		myTree = new Star(myTree);
		
		myTree.printAllTreeInfo(); 
		

	}

}
