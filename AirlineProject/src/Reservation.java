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

public class Reservation {
	private Flight flight;
	private Seat assignedSeat;
	private Customer givenCustomer;

	public Flight getFlightNumber() {
		return flight;
	}

	public void setFlight(Flight flightNumber) {
		this.flight = flightNumber;
	}

	public Seat getAssignedSeat() {
		return assignedSeat;
	}

	public void setAssignedSeat(Seat assignedSeat) {
		this.assignedSeat = assignedSeat;
	}

	public Customer getGivenCustomer() {
		return givenCustomer;
	}

	public void setGivenCustomer(Customer givenCustomer) {
		this.givenCustomer = givenCustomer;
	}

	@Override
	public String toString() {
		return "Name       : " + givenCustomer.getFirstName() + "\nLast Name  : " + givenCustomer.getLastName()
				+ "\nFrom       : " + flight.getDeparturePlace() + "\nTo         : " + flight.getDestination()
				+ "\nDate       : " + flight.getDate() + "\nTime       : " + flight.getDepartureTime()
				+ "\nSeat number: " + assignedSeat.getId();
	}
}
