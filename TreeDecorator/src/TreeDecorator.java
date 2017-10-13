/*
 * Author: Owen Sanders
 * Class: CSI-340-01
 * Assignment: Lab - 04
 * Due Date: Thursday October 12 midnight
 *
 * Description: Decorator object.
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

public class TreeDecorator extends Tree {
	protected final Tree finalTree;

	public TreeDecorator(Tree tree) {
		this.finalTree = tree;
	}

	public Double getCost() {
		return finalTree.getCost();
	}

	public String getDescription() {
		return finalTree.getDescription();
	}

}
