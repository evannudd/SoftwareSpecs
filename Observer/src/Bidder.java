/*
 * Author: Owen Sanders
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

public class Bidder implements BidderObserver {
	
	String name; 


	double CurrentItemPrice = 0; 
	double MyLastPrice = 0; 
	Strategy myStrats; 
	Auctioneer myAuction; 
	
	public Auctioneer getMyAuction() {
		return myAuction;
	}

	public void setMyAuction(Auctioneer myAuction) {
		this.myAuction = myAuction;
	}
	
	public void makeBid() { 
		if (CurrentItemPrice == MyLastPrice && MyLastPrice != 0){ // avoid bidding against yourself. 
			return; 
		}
		else{
			if(myStrats.defineBid(CurrentItemPrice) == 0)
			{
				System.out.println( name + " refuses to bid!");
			}
			else
			{
				System.out.println( name + " is bidding " + myStrats.defineBid(CurrentItemPrice));
			}
			
			MyLastPrice = myStrats.defineBid(CurrentItemPrice); 
			myAuction.tryPrice(myStrats.defineBid(CurrentItemPrice));
		}
	}

	@Override
	public void update(double newPrice) {
		
		CurrentItemPrice = newPrice; 
		System.out.println( name + " has been alerted that the item now costs $" + CurrentItemPrice);

	}

		public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Strategy getMyStrats() {
		return myStrats;
	}

	public void setMyStrats(Strategy myStrats) {
		this.myStrats = myStrats;
	}

}
