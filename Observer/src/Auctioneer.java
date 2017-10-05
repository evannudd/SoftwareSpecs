import java.util.ArrayList;

/*
 * Author: 
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

public class Auctioneer implements AuctioneerSubject {

	private ArrayList<Bidder> bidders = new ArrayList<Bidder>();

	@Override
	public void registerObserver(Bidder bid) {
		bidders.add(bid);
	}

	@Override
	public void removeObserver(Bidder bid) {
		// TODO Auto-generated method stub
		if (bidders.indexOf(bid) != -1) {
			bidders.remove(bid);
		}
	}

	@Override
	public void notifyObservers() {
		for (Bidder bid : bidders) {
			bid.update();
		}
	}

}
