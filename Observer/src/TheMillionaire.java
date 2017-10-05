/*
 * Author: Owen Sanders
 * Class: CSI-340-01
 * Assignment: Lab - 03
 * Due Date: Thursday October 4 2pm
 *
 * Description: The millionare strategy
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

public class TheMillionaire implements Strategy {

	private double MAXBID = 1000000.0;
	private double MINBID = 100000.0; // They won't even try if it's not worth
										// something...
	private double STEP = 10000.0;

	@Override
	public double defineBid(double currentPrice) {

		if (currentPrice >= MINBID && currentPrice < MAXBID - STEP) {
			return currentPrice + STEP;
		}

		return 0;
	}

}
