/*
 * Author: Evan Nudd & Owen Sanders
 * Class: CSI-340-01
 * Assignment: Lab - 04
 * Due Date: Thursday October 12 midnight
 *
 * Description: The base class for a Tree object.
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

public abstract class Tree {
	private String description;
	private Double cost;

	public String getDescription() {
		return description;
	}

	public Double getCost() {
		return cost;
	}

	public void printAllTreeInfo() {
		System.out.println(getDescription() + " - It cost us a whopping $" + getCost().toString() + ".");
	}
}
