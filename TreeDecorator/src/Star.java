/*
 * Author: Owen Sanders
 * Class: CSI-340-01
 * Assignment: Lab - 04
 * Due Date: Thursday October 12 midnight
 *
 * Description: A decoration on a tree.
 *
 * Certification of Authenticity: I  certify  that  this  is  entirely
 *  my  own  work,  except  where  I  have  given fully-documented
 *  references  to  the  work  of  others.  I  understand  the definition
 *  and consequences of plagiarism and acknowledge that the assessor of
 *  this assignment may, for the purpose of assessing this assignment:-
 *  Reproduce  this  assignment  and  provide  a  copy  to  another
 *  member  of academic staff; and/or-Communicate  a  copy  of  this
 *  assignment  to  a  plagiarism  checking service  (which  may  then
 *  retain  a  copy  of  this  assignment  on  its database for the purpose of
 *  future plagiarism checking)
 */

public class Star extends TreeDecorator {

	private double cost = 10;

	private String description = "a lovely shiny star, ";

	protected Tree beautifulTree;

	public Star(Tree myTree) {
		super(myTree);

		if (myTree.getDescription().indexOf("star") > 0) // search for substring
		{
			System.out.println("Tree already has a star!");
			description = ""; // a good hack, eh?
			cost = 0;
		} // because there can only be one star.

	}

	public Double getCost() {
		return super.getCost() + cost;
	}

	public String getDescription() {
		return super.getDescription() + description;
	}
}
