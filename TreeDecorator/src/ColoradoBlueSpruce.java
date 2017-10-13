/*
 * Author: 
 * Class: CSI-340-01
 * Assignment: Lab - 04
 * Due Date: Thursday October 12 midnight
 *
 * Description: 
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

public class ColoradoBlueSpruce extends Tree {
	private double cost = 20;

	private String description = "A pricey blue spruce from Colorado decorated with ";

	public Double getCost() {
		return cost; // will be appended by the decorators.
	}

	public String getDescription() {
		return description;
	}
}
