
/*
 * Author: Evan Nudd
 * Class: CSI-340-01
 * Assignment: Lab - 01 Airline Reservation System 
 * Due Date: Saturday 12pm
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

import java.util.ArrayList;

public class Plane {

	private int MAX_SEATS;

	private ArrayList<Seat> seats;

	public Plane(int maxNumberSeats) {
		MAX_SEATS = maxNumberSeats; // some default number
		seats = new ArrayList<Seat>();
	}

	public boolean addSeat(Seat seat) {
		if (seats.size() < MAX_SEATS) {
			seats.add(seat);
			return true;
		}

		return false;
	}

	public int getNumberNormalSeats() {
		int numberOfSeats = 0;

		for (Seat seat : seats) {
			if (seat instanceof NormalSeat) {
				numberOfSeats += 1;
			}
		}

		return numberOfSeats;
	}

	public int getNumberVIPSeats() {
		int numberOfSeats = 0;

		for (Seat seat : seats) {
			if (seat instanceof VIPSeat) {
				numberOfSeats += 1;
			}
		}

		return numberOfSeats;
	}

	public int getMAXSEATS() {
		return MAX_SEATS;
	}

}
