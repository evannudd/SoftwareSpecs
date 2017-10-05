/*
 * Author: Evan Nudd
 * Class: CSI-340-01
 * Assignment: Lab - 03
 * Due Date: Thursday October 4 2pm
 *
 * Description: A class implementing the guitar Interface. 
 * This is for the Flying V. It is a cool guitar. 
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

public class Item {
	private Bidder bidder;
	private String name;
	private double currentPrice;

	public void tryPrice() {

	}

	private void updatePrice(double price) {
		this.currentPrice = price;
	}

	public double getPrice() {
		return currentPrice;
	}

	public void setBidder(Bidder bid) {
		this.bidder = bid;
	}

	public Bidder getBidder() {
		return bidder;
	}
}