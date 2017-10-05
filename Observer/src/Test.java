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

public class Test {

	public static void main(String[] args) {
		
		Strategy Aggressive = new DrAggressive(); 
		Strategy Wealth = new TheMillionaire(); 
		Strategy Sweet = new SweetPete(); 
		
		
		Auctioneer Charlie = new Auctioneer();
		Item FabrigeEgg = new Item(); 
		
		Charlie.setItem(FabrigeEgg);
		
		Bidder Pete = new Bidder(); 
		Pete.setName("Pete");
		Pete.setMyAuction(Charlie);
		Pete.setMyStrats(Sweet);
		
		Bidder Elon = new Bidder(); 
		Elon.setName("Ol' Musky");
		Elon.setMyAuction(Charlie);
		Elon.setMyStrats(Wealth);
		
		Bidder Brick = new Bidder();
		Brick.setName("Brick");
		Brick.setMyAuction(Charlie);
		Brick.setMyStrats(Aggressive);
		
		
		
		Charlie.registerObserver(Pete);
		Charlie.registerObserver(Elon);
		Charlie.registerObserver(Brick);
		
		
		while(FabrigeEgg.getPrice() < 500000)
		{
			Pete.makeBid();
			Elon.makeBid();
			Brick.makeBid();
		}
		
		
		
		FabrigeEgg.setName("Golden Fabrige Egg");
		
	}
}
